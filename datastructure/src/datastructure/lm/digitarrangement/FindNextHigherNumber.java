package datastructure.lm.digitarrangement;

import java.util.Arrays;

public class FindNextHigherNumber {

	public static void main(String[] args) {
		int num = 218765;
		int[] result = convertIntToArray(num);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

	private static int[] convertIntToArray(int num) {
		String tempNum = String.valueOf(num);
		int[] arr = new int[tempNum.length()];
		for (int i = 0; i < tempNum.length(); i++) {
			arr[i] = tempNum.charAt(i) - '0';
		}

		return findImmediateHigherNumber(arr, arr.length);
	}

	private static int[] findImmediateHigherNumber(int[] arr, int n) { // 2 1 8 7 6 5
		int i = n - 1;
		for (i = n - 1; i >= 0; i--) {
			if (arr[i - 1] < arr[i]) {
				break;
			}
		}

		int element = i - 1; // 1
		int min = i; // 8

		for (int j = i; j < n; j++) {
			if (arr[j] < arr[min] && arr[j] > arr[element]) {
				min = j;
			}
		}

		int tempNum = arr[element];
		arr[element] = arr[min];
		arr[min] = tempNum;

		Arrays.sort(arr, i, n);

		return arr;
	}

}
