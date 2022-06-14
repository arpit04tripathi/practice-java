package com.a04t.designpatterns.structural.structural_2_composite;

public class Triangle implements Shape {
	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with color " + fillColor);
	}
}