package datastructure.lm.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9 10 11 12
		int[] arr = new int[] { 17, 13, 5, 21, 15, 34, 31, 19, 23, 27, 29, 45, 39 }; // 0 1 2 3 4 5 6 7 8 9 ...11 12
		int[] result = new int[arr.length];

		mergeSort(arr, result, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void mergeSort(int[] arr, int[] result, int start, int end) {
		if (start == end) {
			return;
		} else {
			int mid = (start + end) / 2;
			mergeSort(arr, result, start, mid);
			mergeSort(arr, result, mid + 1, end);
			merge(arr, result, start, mid, end);
		}
	}

	private static void merge(int[] arr, int[] result, int start, int mid, int end) {

		int i = start, k = start, j = mid + 1;
		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				result[k++] = arr[i++];
			} else {
				result[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			result[k++] = arr[i++];
		}
		while (j <= end) {
			result[k++] = arr[j++];
		}

		for (int m = start; m <= end; m++) {
			arr[m] = result[m];
		}

	}

}
