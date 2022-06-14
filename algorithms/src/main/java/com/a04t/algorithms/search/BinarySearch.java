package com.a04t.algorithms.search;

import java.util.concurrent.TimeUnit;

public class BinarySearch {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println("Hello World.");
	    long endTime = System.nanoTime();
	    long durationInNano = (endTime - startTime);  //Total execution time in nano seconds
	    //Same duration in millis
	    long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);  //Total execution time in nano seconds
	    System.out.println(durationInNano);
	    System.out.println(durationInMillis);
	}
}
