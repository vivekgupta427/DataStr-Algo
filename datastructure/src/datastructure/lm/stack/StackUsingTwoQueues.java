package datastructure.lm.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

	static Queue<Integer> q1 = new LinkedList<>();
	static Queue<Integer> q2 = new LinkedList<>();

	private static void push(int item) {
		if (q1.isEmpty()) {
			q1.add(item);
			System.out.println("Item " + item + " is pushed into stack");
		} else {
			while (!q1.isEmpty()) {
				q2.add(q1.remove());
			}

			q1.add(item);

			while (!q2.isEmpty()) {
				q1.add(q2.remove());
			}
		}
	}

	private static int pop() {
		if (!q1.isEmpty()) {
			Integer remove = q1.remove();
			System.err.println(remove + " is removed from stack.");
			return remove;
		}
		return -1;
	}

	public static void main(String[] args) {
		StackUsingTwoQueues.push(1);
		StackUsingTwoQueues.push(2);
		StackUsingTwoQueues.push(3);
		StackUsingTwoQueues.push(4);

		System.out.println();
		StackUsingTwoQueues.q1.forEach(item -> {
			System.out.print(item + " ");
		});

		System.out.println();
		StackUsingTwoQueues.pop();
		System.out.println();
		StackUsingTwoQueues.q1.forEach(item -> {
			System.out.print(item + " ");
		});

	}

}
