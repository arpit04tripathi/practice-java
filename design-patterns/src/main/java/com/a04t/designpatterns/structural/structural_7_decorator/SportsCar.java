package com.a04t.designpatterns.structural.structural_7_decorator;

public class SportsCar extends CarDecorator {
	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}