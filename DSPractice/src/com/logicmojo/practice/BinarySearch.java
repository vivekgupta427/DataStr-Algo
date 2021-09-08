package com.logicmojo.practice;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = arr.length;
		int key = 11;
		int index = findElement(arr, n, key, 0, n - 1);
		if (index < 0) {
			System.out.println("Item " + key + " not found in array");
		} else {
			System.out.println("Item " + key + " found at index " + index);
		}
	}

	private static int findElement(int[] arr, int n, int key, int start, int end) {

		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (key == arr[mid]) {
			return mid;
		} else if (key >= arr[start] && key < arr[mid]) {
			return findElement(arr, n, key, start, mid - 1);
		} else {
			return findElement(arr, n, key, mid + 1, end);
		}

	}

}
