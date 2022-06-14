package com.a04t.designpatterns.structural.structural_2_composite;

public class Circle implements Shape {
	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}
}