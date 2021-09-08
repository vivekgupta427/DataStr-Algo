package com.logicmojo.practice;

import java.util.Arrays;

/*Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. 
 * Do not allocate extra space for another array, Time complexity O(n) and Space complexity O(1)*/

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;

		System.out.println(removeDuplicates(arr, n));

		Arrays.stream(arr).forEach(item -> {
			System.out.print(item + " ");
		});
	}

	private static int removeDuplicates(int[] arr, int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}

		arr[j++] = arr[n - 1];
		return j;

	}

}
