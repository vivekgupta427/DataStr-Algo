package datastructure.lm.queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
	
	
	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();

	public void enqueue(int item) {
		if(s1.isEmpty()) {
			s1.push(item);
		} else {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			
			s1.push(item);
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
	}
	
	public int dequeue() {
		if(s1.isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			Integer peek = s1.peek();
			s1.pop();
			return peek;
		}
	}
	
	
	public static void main(String[] args) {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		QueueUsingTwoStacks.s1.forEach(item ->{
			System.out.print(item + " ");
		});
		
		System.out.println();
		System.out.println(queue.dequeue());
		System.out.println();
		QueueUsingTwoStacks.s1.forEach(item ->{
			System.out.print(item + " ");
		});
		

	}

}
