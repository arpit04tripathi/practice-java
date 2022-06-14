package com.a04t.designpatterns.structural.structural_7_decorator;

public class CarDecorator implements Car {
	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}
}