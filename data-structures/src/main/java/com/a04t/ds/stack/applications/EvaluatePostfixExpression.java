package com.a04t.ds.stack.applications;

import java.util.Stack;

public class EvaluatePostfixExpression {
	public static int evaluatePostfix(String exp) {

		int result = 0;
		char[] chars = exp.toCharArray();
		Stack<Character> operatorStack = new Stack<>();
		Stack<Integer> operandStack = new Stack<>();
		for (char ch : chars) {
			if (isOperator(ch)) {
				result = performOperation(ch, operandStack.pop(), operandStack.pop());
				operandStack.push(result);
			} else {
				operandStack.add(Character.digit(ch, 10));
			}
		}
		return result;
	}

	private static int performOperation(char operator, int op2, int op1) {
		int result = 0;
		switch (operator) {
		case '+':
			result = op1 + op2;
			break;
		case '-':
			result = op1 - op2;
			break;
		case '*':
			result = op1 * op2;
			break;
		case '/':
			result = op1 / op2;
			break;
		case '%':
			result = op1 % op2;
			break;
		}
		return result;
	}

	private static boolean isOperator(char ch) {
		return matchesAnyChar(ch, '+', '-', '*', '/', '%');
	}

	private static boolean matchesAnyChar(char input, char... chars) {
		boolean flag = false;
		for (char ch : chars) {
			if (input == ch) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}
