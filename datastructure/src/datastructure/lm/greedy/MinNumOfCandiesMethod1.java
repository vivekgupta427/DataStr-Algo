package datastructure.lm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumOfCandiesMethod1 {

	public static void main(String[] args) {

		System.out.println("Enter number of childern");
		Scanner sc = new Scanner(System.in);
		int numOfChildern = sc.nextInt();

		int[] ratings = new int[numOfChildern];
		System.out.println("Enter ratings of " + numOfChildern + " childern");
		for (int i = 0; i < numOfChildern; i++) {
			ratings[i] = sc.nextInt();
		}

		sc.close();

		int findMinNumOfCandies = findMinNumOfCandies(ratings);
		System.out.println(findMinNumOfCandies);

	}

	private static int findMinNumOfCandies(int[] ratings) {
		int totalCandies = 0;
		int maxCandies = 0;

		Arrays.sort(ratings);
		for (int i = 0; i < ratings.length; i++) {
			if (i == 0) {
				totalCandies++;
				maxCandies = 1;
			} else if (ratings[i] > ratings[i - 1]) {
				maxCandies = maxCandies + 1;
				totalCandies = totalCandies + maxCandies;
			} else if (ratings[i] == ratings[i - 1]) {
				totalCandies++;
			}
		}

		return totalCandies;
	}

}
