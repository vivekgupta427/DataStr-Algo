
public class FindMaxOccurance {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 3, 3, 3, 4, 5, 5, 5, 6, 6 };
		int keyItem = 5;
		int findMaxOccurance = findMaxOccurance(arr, 0, arr.length, keyItem, 0);
		System.out.println(findMaxOccurance);

	}

	private static int findMaxOccurance(int[] arr, int start, int end, int keyItem, int count) {

		if (start > end) {
			return count;
		}
		int mid = (start + end) / 2;

		if (keyItem < arr[mid]) {
			return findMaxOccurance(arr, start, mid - 1, keyItem, count);
		} else if (keyItem > arr[mid]) {
			return findMaxOccurance(arr, mid + 1, end, keyItem, count);
		} else {
			count++;
			findMaxOccurance(arr, start, mid - 1, keyItem, count);
			findMaxOccurance(arr, mid + 1, end, keyItem, count);
			count = end - start;
			return count;

		}

	}

}
