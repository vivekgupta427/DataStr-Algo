package datastructure.lm.sorting;

/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order 
 * of the non-zero elements in O(n) Time complexity and O(1) Space complexity with single traversal allowed
*/

public class Move0sToEndOfArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 2, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		arrangeArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

	private static void arrangeArray(int[] arr) {
		int left = 0;
		int right = 0;

		while (right <= arr.length - 1) {
			if (arr[left] != 0) {
				left++;
				right++;
			} else {
				while (arr[right] == 0) {
					right++;
				}

				swap(arr, left, right);
				left++;
				right++;

			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
