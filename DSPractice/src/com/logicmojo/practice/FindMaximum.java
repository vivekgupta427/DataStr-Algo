package com.logicmojo.practice;

/*One array of integers is given as an input ,which is initially increasing and then decreasing or 
it can be only increasing or decreasing , you need to find the maximum value in the array in O(Log n) Time complexity
and O(1) Space Complexity*/

public class FindMaximum {

	public static void main(String[] args) {

	//	int[] arr = new int[] { 6, 9, 15, 25, 35, 50, 51, 41, 29, 23, 8 };
		int[] arr = new int[] { 51,1 };
		int n = arr.length;

		int max = findMax(arr, n, 0, n - 1);
		System.out.println(max);

	}

	private static int findMax(int[] arr, int n, int start, int end) {
		if (start > end) {
			return -1;
		}

		if (start == end) {
			return arr[start];
		}

		if (end == start + 1) {
			return arr[start] > arr[end] ? arr[start] : arr[end];
		}

		int mid = (start + end) / 2;
		if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
			return arr[mid];
		} else if (arr[mid - 1] < arr[mid] && arr[mid + 1] > arr[mid]) {
			return findMax(arr, n, mid + 1, end);
		} else
			return findMax(arr, n, start, mid - 1);

	}

}
