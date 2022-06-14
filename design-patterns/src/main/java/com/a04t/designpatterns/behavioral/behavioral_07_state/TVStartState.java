package com.a04t.designpatterns.behavioral.behavioral_07_state;

public class TVStartState implements State {
	@Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}
}
