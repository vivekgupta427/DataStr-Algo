package datastructure.lm.search;

/*We rotate an ascending order sorted array at some point unknown to user. So for instance, 3 4 5 6 7 might 
become 5 6 7 3 4. Modify binary search algorithm to find an element in the rotated array in O(log n) time 
and O(1) Space complexity*/

public class FindElementInRotatedArray {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9 10
		int[] arr = new int[] { 13, 17, 19, 23, 27, 29, 35, 39, 5, 8, 10 };

		int key = 13;

		int findElement = findElement(arr, key, 0, arr.length - 1);

		System.out.println("Item found at index: " + findElement);

	}

	private static int findElement(int[] arr, int key, int start, int end) {
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (arr[mid] == key) {
			return mid;
		}
		if (arr[mid] >= arr[start]) {
			if (key < arr[mid] && key >= arr[start]) {
				return findElement(arr, key, start, mid - 1);
			}
			return findElement(arr, key, mid + 1, end);

		}
		
		if(key > arr[mid] && key <= arr[end]) {
			return findElement(arr, key, mid+1, end);
		}
		return findElement(arr, key, start, mid-1);

	}

}
