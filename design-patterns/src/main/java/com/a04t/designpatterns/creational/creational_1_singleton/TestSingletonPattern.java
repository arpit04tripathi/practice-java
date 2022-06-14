package com.a04t.designpatterns.creational.creational_1_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingletonPattern {

	public static void main(String[] args) {

		DclSingleton instanceOne = DclSingleton.getInstance();
		DclSingleton instanceTwo = DclSingleton.getInstance();

		System.out.println(String.format("Before Reflection, instanceOne - %s, instanceTwo - %s",
				instanceOne.hashCode(), instanceTwo.hashCode()));

		// Broken with Reflection
		try {
			Constructor<?>[] constructors = DclSingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (DclSingleton) constructor.newInstance();
			}
			System.out.println(String.format("After Reflection, instanceOne - %s, instanceTwo - %s",
					instanceOne.hashCode(), instanceTwo.hashCode()));
			System.out.println("Different hashcodes, means Singleton Broken.");
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

		// Broken with Reflection
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.txt"));
			out.writeObject(instanceOne);
			out.close();
			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.txt"));
			instanceTwo = (DclSingleton) in.readObject();
			in.close();
			System.out.println(String.format("After Serialization, instanceOne - %s, instanceTwo - %s",
					instanceOne.hashCode(), instanceTwo.hashCode()));
			System.out.println("Different hashcodes, means Singleton Broken.");
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
