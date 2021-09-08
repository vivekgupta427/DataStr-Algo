package datastructure.lm;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6 };

		int length = removeDuplicates(arr, arr.length);

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + ", ");
		}

		System.out.println("\n The length is : " + length);

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
