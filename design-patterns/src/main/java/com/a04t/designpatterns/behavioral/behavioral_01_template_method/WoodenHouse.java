package com.a04t.designpatterns.behavioral.behavioral_01_template_method;

public class WoodenHouse extends HouseTemplate {
	@Override
	 public void buildWalls() {
	  System.out.println("Building Wooden Walls");
	 }

	@Override
	 public void buildPillars() {
	  System.out.println("Building Pillars with Wood coating");
	 }
}
