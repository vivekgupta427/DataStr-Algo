package datastructure.lm.search;

/*One array of integers is given as an input ,which is initially increasing and then decreasing or 
it can be only increasing or decreasing , you need to find the maximum value in the array in O(Log n) Time complexity
and O(1) Space Complexity*/

public class FindMaximumInLogn {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9 10
		int[] arr = new int[] { 27, 29, 35, 39, 23, 19, 17, 13, 10, 8,5  };
		
		System.out.println(findMaximumValue(arr, 0, arr.length-1));

	}

	private static int findMaximumValue(int[] arr, int start, int end) {
		if (start == end) {
			return arr[start];
		}

		if (end == start + 1) {
			return arr[start] >= arr[end] ? arr[start] : arr[end];
		}

		int mid = (start + end) / 2;

		if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
			return arr[mid];
		}

		if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
			return findMaximumValue(arr, start, mid - 1);
		} else {
			return findMaximumValue(arr, mid + 1, end);
		}

	}

}
