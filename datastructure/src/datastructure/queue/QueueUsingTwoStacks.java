package datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingTwoStacks {

	static class Stack{
		Queue<Integer> queue1 = new LinkedList<>();
		Queue<Integer> queue2 = new LinkedList<>();
		static int currrSize;
		
		public Stack() {
			currrSize = 0;
		}
		
		private void push(int x) {
			queue2.add(x);
			currrSize ++;
			while(!queue1.isEmpty()) {
				queue2.add(queue1.peek());
				queue1.remove();
			}
			
			Queue<Integer> q = queue1;
			queue1 = queue2;
			queue2 = q;
		}
		
		private void pop() {
			if(!queue1.isEmpty()) {
				queue1.remove();
				currrSize--;
			}
		}
		
		private int getCurrentSize() {
			return currrSize;
		}
		
		private void printElements() {
			queue1.forEach(item -> System.out.println(item));
		}
				
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(4);
		
		stack.printElements();
		
		System.out.println("Current Size : "+stack.getCurrentSize());
		stack.pop();
		System.out.println("Current Size : "+stack.getCurrentSize());
		stack.printElements();
		
		stack.pop();
		stack.printElements();

	}

}
