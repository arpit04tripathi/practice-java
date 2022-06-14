package com.a04t.designpatterns.creational.creational_4_builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
		// Using builder to get object without any inconsistent state or arguments
		// management issues
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(comp.toString());
	}
}