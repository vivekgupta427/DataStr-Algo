package com.logicmojo.practice;

import java.util.Arrays;

//Find the minimum number of platforms are required for the railway as no train waits
public class MinNumOfPlatforms {

	public static void main(String[] args) {

		double[] arrival = new double[] { 1.00, 1.40, 1.50, 2.00, 2.15, 4.00 };
		double[] departure = new double[] { 1.10, 3.00, 2.20, 2.30, 3.15, 6.00 };

		int platforms = findMinNumOfPlatforms(arrival, departure);
		System.out.println(platforms);

	}

	private static int findMinNumOfPlatforms(double[] arrival, double[] dep) {
		Arrays.sort(arrival);
		Arrays.sort(dep);
		int n = arrival.length;
		
		int platformsNeeded = 0;
		int maxPlatforms = 0;
		int i=0; int j=0;
		
		while(i<n && j <n) {
			if(arrival[i] < dep[j]) {
				platformsNeeded++;
				i++;
				if(platformsNeeded > maxPlatforms) {
					maxPlatforms = platformsNeeded;
				}
			} else {
				platformsNeeded--;
				j++;
			}
		}
		
		return maxPlatforms;
		
		

	}

}
