package datastructure.queue;

import java.util.Stack;

public class QueueUsingTwoStacksMethod1 {

	private static Stack<Integer> stack1;
	private static Stack<Integer> stack2;

	public QueueUsingTwoStacksMethod1() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	private void enqueue(int x) {
		if (stack1.isEmpty()) {
			stack1.push(x);
		} else if (!stack1.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}

			stack1.push(x);

			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
		}
	}

	private int dequeue() {
		return stack1.pop();
	}

	private static void printQueue() {
		stack1.forEach(item -> System.out.println(item));
	}

	public static void main(String[] args) {
		QueueUsingTwoStacksMethod1 queue = new QueueUsingTwoStacksMethod1();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		printQueue();
		System.out.println();
		System.out.println(queue.dequeue());
		System.out.println();
		printQueue();

	}

}
