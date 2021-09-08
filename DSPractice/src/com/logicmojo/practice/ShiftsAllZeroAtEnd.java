package com.logicmojo.practice;

import java.util.Arrays;

/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order 
 * of the non-zero elements in O(n) Time complexity and O(1) Space complexity with single traversal allowed
*/
public class ShiftsAllZeroAtEnd {

	public static void main(String[] args) {

		// int[] arr = new int[] { 1, 3, 0, 0, 4, 0, 9 };
		int[] arr = new int[] { 2, 2, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		int n = arr.length;

		shiftAllZerosToRight(arr, n);

		Arrays.stream(arr).forEach(item -> {
			System.out.print(item + " ");
		});

	}

	private static void shiftAllZerosToRight(int[] arr, int n) {
		int j = 0;
		int i = 0;
		while (j < n - 1) {
			if (arr[j] != 0) {
				j++;
			} else {
				i = j;
				while (arr[j] == 0) {
					j++;
				}
				swap(arr, i, j);
			}
		}

	}

	private static void swap(int[] arr, int num1, int num2) {
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
	}

}
