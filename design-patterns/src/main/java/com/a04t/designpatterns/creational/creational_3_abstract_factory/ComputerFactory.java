package com.a04t.designpatterns.creational.creational_3_abstract_factory;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}