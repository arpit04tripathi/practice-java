package com.a04t.designpatterns.structural.structural_1_adapter;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}