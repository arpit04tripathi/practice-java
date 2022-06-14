package com.a04t.designpatterns.structural.structural_7_decorator;

public class BasicCar implements Car {
	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}
}
