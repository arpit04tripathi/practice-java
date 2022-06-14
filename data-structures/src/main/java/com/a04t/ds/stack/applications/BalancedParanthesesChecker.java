package com.a04t.ds.stack.applications;

import com.a04t.ds.stack.StackAsLinkedList;

public class BalancedParanthesesChecker {

	public static boolean checkExpression(String exp) {

		StackAsLinkedList stack = new StackAsLinkedList();
		for (char ch : exp.toCharArray()) {
			if (isOpeningParantheses(ch)) {
				stack.push(ch);
			} else if (isClosingParantheses(ch)) {
				char open = (char) stack.top().getData();
				stack.pop();
				if (!isPair(open, ch))
					return false;
			}
		}
		return stack.isEmpty();
	}

	private static boolean isOpeningParantheses(char ch) {
		return (ch == '[' || ch == '{' || ch == '(');
	}

	private static boolean isClosingParantheses(char ch) {
		return (ch == ']' || ch == '}' || ch == ')');
	}

	private static boolean isPair(char open, char close) {
		boolean flag = false;
		if ((open == '[' && close == ']') || (open == '{' && close == '}') || (open == '(' && close == ')')) {
			flag = true;
		}
		return flag;
	}
}
