package datastructure.stack;

import java.util.Stack;

public class StackOperationsInConstantSpaceAndTime {

	private static Stack<Integer> stack1;
	private static int minElement;
	private static int maxElement;

	public StackOperationsInConstantSpaceAndTime() {
		stack1 = new Stack<>();

	}

	private void pushOperation(int x) {
		if (stack1.isEmpty()) {
			stack1.push(x);
			minElement = x;
		} else {
			if (x <= minElement) {
				stack1.push(2 * x - minElement);
				minElement = x;

			} else {
				stack1.push(x);
			}
		}
	}
	
	private void pushMaxOperation(int x) {
		if(stack1.isEmpty()) {
			stack1.push(x);
			maxElement = x;
		} else {
			if(x<=maxElement) {
				stack1.push(x);
			} else {
				stack1.push(2*x - maxElement);
				maxElement = x;
				
			}
		}
	}
	
	private void popMaxOperation() {
		if (stack1.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			int top = stack1.pop();
			if(top > maxElement) {
				maxElement =  2 * maxElement - top;
			} else {
				System.out.println(top);
			}
		}
	}

	private void popOperation() {
		if (stack1.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			int top = stack1.pop();
			if (top <= minElement) {
				minElement = 2 * minElement - top;
			} else {
				System.out.println(top);
			}

		}
	}
	
	private static int getMaxElement() {
		if (stack1.isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		System.out.println("maxElement: " + maxElement);
		return maxElement;
	}

	private static int getMinElement() {
		if (stack1.isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		System.out.println("minElement: " + minElement);
		return minElement;
	}

	private static void printElements() {
		stack1.forEach(item -> System.out.println(item));
	}

	public static void main(String[] args) {
		StackOperationsInConstantSpaceAndTime stack = new StackOperationsInConstantSpaceAndTime();
		stack.pushMaxOperation(16);
		stack.pushMaxOperation(14);
		stack.pushMaxOperation(17);
		stack.pushMaxOperation(18);
		stack.pushMaxOperation(15);
		getMaxElement();
		printElements();
		stack.popMaxOperation();
		getMaxElement();
		stack.popMaxOperation();
		getMaxElement();
		stack.popMaxOperation();
		getMaxElement();
		stack.popMaxOperation();
		getMaxElement();

	}

}
