package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class NextGreaterElement {

	public static void main(String[] args) {

		int[] arr = new int[] { 13, 7, 6, 12 };
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < arr.length; i++) {
			q.add(arr[i]);
		}

		int count = 1;
		int temp = q.remove(); // 13
		boolean flag = false;
		for (int i = count; i < arr.length; i++) {
			if (arr[i] > temp) {
				System.out.print(arr[i] + " ");
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.print(-1 + " ");
		}

	}

}
