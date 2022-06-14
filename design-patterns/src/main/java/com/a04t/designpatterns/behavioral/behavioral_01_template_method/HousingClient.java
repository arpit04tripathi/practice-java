package com.a04t.designpatterns.behavioral.behavioral_01_template_method;

public class HousingClient {
	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		// using template method
		houseType.buildHouse();
		System.out.println("************");
		houseType = new GlassHouse();
		houseType.buildHouse();
	}
}