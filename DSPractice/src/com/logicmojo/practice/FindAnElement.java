package com.logicmojo.practice;

/*We rotate an ascending order sorted array at some point unknown to user. So for instance, 3 4 5 6 7 might 
become 5 6 7 3 4. Modify binary search algorithm to find an element in the rotated array in O(log n) time 
and O(1) Space complexity*/

public class FindAnElement {

	public static void main(String[] args) {

		//int[] arr = new int[] { 7,8,9,10,1,2,3,4,5,6};
		int[] arr = new int[] { 13, 17, 19, 23, 27, 29, 35, 39, 5, 8, 10 };
		int n = arr.length;
		int key = 29;

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

		if (arr[mid] == key) {
			return mid;
		} else if (arr[mid] >= arr[start]) {
			if (key >= arr[start] && key < arr[mid]) {
				return findElement(arr, n, key, start, mid - 1);
			} else {
				return findElement(arr, n, key, mid + 1, end);
			}
		} else {
			if (key > arr[mid] && key <= arr[end]) {
				return findElement(arr, n, key, mid + 1, end);
			} else {
				return findElement(arr, n, key, start, mid - 1);
			}
		}

	}

}
