package com.a04t.designpatterns.behavioral.behavioral_01_template_method;

public class GlassHouse extends HouseTemplate {
	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}
}
