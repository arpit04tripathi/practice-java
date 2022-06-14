package com.a04t.designpatterns.structural.structural_1_adapter;

public interface SocketAdapter {
	
	public Volt get120Volt();

	public Volt get12Volt();

	public Volt get3Volt();
}