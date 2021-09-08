package datastructure.queue
;

import java.util.Stack;

public class QueueUsingTwoStacksMethod2 {

	private static Stack<Integer> stack1;
	private static Stack<Integer> stack2;

	public QueueUsingTwoStacksMethod2() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	private void enqueue(int x) {
		stack1.push(x);
	}

	private int dequeue() {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}

		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		return stack2.pop();
	}

	private static void printQueue() {
		stack1.forEach(item -> System.out.println(item));
		stack2.forEach(item -> System.out.println(item));
	}

	public static void main(String[] args) {

		QueueUsingTwoStacksMethod2 queue = new QueueUsingTwoStacksMethod2();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);

		System.out.println("Queue After enqueue");
		printQueue();
		System.out.println();
		System.out.println(" removing first element " + queue.dequeue());
		System.out.println("Queue after dequeue");
		printQueue();

		System.out.println();

		queue.dequeue();
		System.out.println();
		printQueue();

	}

}
