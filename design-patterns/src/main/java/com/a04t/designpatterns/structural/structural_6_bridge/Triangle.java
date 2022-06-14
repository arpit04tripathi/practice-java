package com.a04t.designpatterns.structural.structural_6_bridge;

public class Triangle extends Shape {
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}
}