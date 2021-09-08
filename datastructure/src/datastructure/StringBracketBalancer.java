package datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.Stream;

public class StringBracketBalancer {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Stream<String> lines = reader.lines();
		lines.forEach(line -> {
			System.out.println();
			System.out.println(isStringBalanced(line));
		});

	}

	private static String isStringBalanced(String input) {
		Stack<Character> stack = new Stack<>();
		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			switch (c) {
			case '(':
				stack.push(c);
				break;
			case '{':
				stack.push(c);
				break;
			case '[':
				stack.push(c);
				break;
			case ')':
				if(!stack.isEmpty()) {
					char top1 = stack.peek();
					if (Character.compare('(', top1) == 0) {
						stack.pop();
					}
				}else {
					stack.push('$');
				}
				
				break;
			case '}':
				if(!stack.isEmpty()) {
					char top2 = stack.peek();
					if (Character.compare('{', top2) == 0) {
						stack.pop();
					}
				} else {
					stack.push('$');
				}
				
				break;
			case ']':
				if(!stack.isEmpty()) {
					char top3 = stack.peek();
					if (Character.compare('[', top3) == 0) {
						stack.pop();
					}
				}else {
					stack.push('$');
				}
				
				break;
			}

		}

		if (stack.isEmpty()) {
			return "true";
		} else {
			return "false";
		}

	}

}
