package com.a04t.designpatterns.structural.structural_6_bridge;

public class Pentagon extends Shape {
	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}
}