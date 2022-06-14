package com.a04t.designpatterns.structural.structural_6_bridge;

public class TestBridgePattern {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}