package datastructure.lm.sorting;

/*Array consist of only 0's, 1's and 2's. Write an algorithm to sort  this array in O(n) time complexity 
and O(1) Space complexity with only one traversal*/
public class SortArrayOf012 {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 2, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sortArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	private static void sortArray(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;

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

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
