package com.logicmojo.practice;

import java.util.Arrays;

/*Array consist of only 0's, 1's and 2's. Write an algorithm to sort  this array in O(n) time complexity 
and O(1) Space complexity with only one traversal*/

public class SortArrayOfZeroAndOne {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int n = arr.length;

		sortArray(arr, n);
		Arrays.stream(arr).forEach(item -> {
			System.out.print(item + " ");
		});

	}

	private static void sortArray(int[] arr, int n) {

		// { 2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }
		int low = 0;
		int mid = 0;
		int high = n - 1;
		while (mid <= high) {
			if (arr[mid] == 2) {
				swap(arr, mid, high);
				high--;
			} else if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else {
				mid++;
			}
		}

	}

	private static void swap(int[] arr, int num1, int num2) {
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
	}

}
