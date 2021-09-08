package com.logicmojo.practice;

import java.util.HashSet;
import java.util.Set;

public class FindPairSum {

	public static void main(String[] args) {

		int[] arr = new int[] { 7, 9, 11, 15, 3, 6 };
		int sum = 18;

		findPairToSum(arr, sum);

	}

	private static void findPairToSum(int[] arr, int sum) {

		// ==== Brute Force approach====

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(i + " " + j);
				}
			}
		}

		// =====using o(nlogn)========
		// 3 6 7 9 11 15
		System.out.println("Using an effective approach");
		//Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			if (l > r) {
				return;
			}
			if (arr[l] + arr[r] == sum) {
				System.out.println(l + " " + r);
				l++;
			} else if (arr[l] + arr[r] < sum) {
				l++;
			} else {
				r--;
			}
		}

		// ======== O(n)

		System.out.println("Most effective");
		// 7 9 11 15 3 6
		// 11 9 7 3 15 12
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			int diff = sum - arr[i];
			if (!set.contains(diff)) {
				set.add(diff);
			} else {
				if (diff != arr[i]) {
					System.out.println(diff + " " + arr[i]);
					set.remove( arr[i]);
				}

			}

		}

	}

}
