package com.a04t.designpatterns.behavioral.behavioral_08_visitor;

public interface ItemElement {
	// accept method takes Visitor argument
	public int accept(ShoppingCartVisitor visitor);
}