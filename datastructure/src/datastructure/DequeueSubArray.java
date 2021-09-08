package datastructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeueSubArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		Set<Integer> set = new HashSet<>();
		int n = in.nextInt();
		int m = in.nextInt();

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			set.add(num);

			if (deque.size() == m) {
				if (set.size() > max)
					max = set.size();
				int removeFirst = deque.removeFirst();
				if (!deque.contains(removeFirst)) {
					set.remove(removeFirst);
				}
			}

		}
		in.close();
		System.out.println(max);

	}

}
