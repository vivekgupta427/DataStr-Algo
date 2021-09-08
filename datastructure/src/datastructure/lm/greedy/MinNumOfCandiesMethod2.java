package datastructure.lm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumOfCandiesMethod2 {

	public static void main(String[] args) {

		/*
		 * System.out.println("Enter number of childern"); Scanner sc = new
		 * Scanner(System.in); int numOfChildern = sc.nextInt();
		 * 
		 * int[] ratings = new int[numOfChildern];
		 * System.out.println("Enter ratings of " + numOfChildern + " childern"); for
		 * (int i = 0; i < numOfChildern; i++) { ratings[i] = sc.nextInt(); }
		 * 
		 * sc.close();
		 */
		int[] ratings = new int[] { 1, 5, 2, 1 };

		int findMinNumOfCandies = findMinNumOfCandies(ratings, ratings.length);
		System.out.println(findMinNumOfCandies);
	}

	private static int findMinNumOfCandies(int[] ratings, int size) {
		int[] left = new int[size];

		Arrays.fill(left, 1);

		int sum = 0;
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i - 1] < ratings[i]) {
				left[i] = left[i] + 1;
			}
			if (i < size - 1 && ratings[i] > ratings[i + 1]) {
				left[i] = left[i] + 1;
			}
		}

		for (int i = 0; i < left.length; i++) {
			sum = sum + left[i];
		}

		return sum;
	}

}
