package com.a04t.ds.stack;


import com.a04t.ds.stack.applications.BalancedParanthesesChecker;
import com.a04t.ds.stack.applications.EvaluatePostfixExpression;

public class StackApplicationsRunner {

	public static void main(String[] args) {
		checkParanthesesBalancing("[{()}]");
		checkParanthesesBalancing("[{(})]");
		checkParanthesesBalancing("[{)(}]");
		evaluatePostfixExpression("98*9+");
	}

	private static void checkParanthesesBalancing(String expression) {
		System.out.println(expression + " --> " + BalancedParanthesesChecker.checkExpression(expression));
	}

	private static void evaluatePostfixExpression(String expression) {
		System.out.println(expression + " --> " + EvaluatePostfixExpression.evaluatePostfix(expression));
	}

}
