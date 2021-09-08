//Array of both positive and negative numbers, the task is to find out the sub array whose sum is Zero in Time Complexity O(n)
//and Space Complexity O(n)
// 6 3 -2 5 -3 7 -6 -1 4
package datastructure.lm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SubArray {
	int start;
	int end;

	public SubArray(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class FindSubArraysToSum0 {

	public static void main(String[] args) {

		int[] arr = new int[] { 6, 3, -2, 5, -3, 7, -6, -1, 4 };
		int n = arr.length;
		List<SubArray> findSubArraysToSumZero = findSubArraysToSumZero(arr, n);

		findSubArraysToSumZero.forEach(item -> System.out.print(item.start + " -> " + item.end + "\n"));

	}

	private static List<SubArray> findSubArraysToSumZero(int[] arr, int n) {
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		List<SubArray> resultList = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			if (sum == 0) {
				resultList.add(new SubArray(0, i));
			}
			ArrayList<Integer> list = new ArrayList<>();
			if (map.containsKey(sum)) {
				list = map.get(sum);
				for (int j = 0; j < list.size(); j++) {
					resultList.add(new SubArray(list.get(j) + 1, i));
				}
			}
			list.add(i);
			map.put(sum, list);

		}
		return resultList;

	}

}
