package com.a04t.designpatterns.behavioral.behavioral_09_interpreter;

public class IntToBinaryExpression implements Expression {
	private int i;

	public IntToBinaryExpression(int c) {
		this.i = c;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getBinaryFormat(this.i);
	}
}