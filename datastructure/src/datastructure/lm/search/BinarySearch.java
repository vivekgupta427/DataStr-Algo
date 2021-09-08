package datastructure.lm.search;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 8, 10, 13, 17, 19, 23, 27, 29, 35, 39 };
		int key = 5;

		int findIndex = findIndex(arr, key, 0, arr.length - 1);

		System.out.println("Item found at index : " + findIndex);

	}

	private static int findIndex(int[] arr, int key, int start, int end) {

		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (key == arr[mid]) {
			return mid;
		} else if (key < arr[mid]) {
			return findIndex(arr, key, start, mid - 1);
		} else {
			return findIndex(arr, key, mid + 1, end);
		}
	}

}
