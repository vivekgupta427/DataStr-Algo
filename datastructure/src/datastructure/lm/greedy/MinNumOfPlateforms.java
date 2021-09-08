package datastructure.lm.greedy;

import java.util.Arrays;

public class MinNumOfPlateforms {

	public static void main(String[] args) {

		double[] arrival = new double[] { 1.00, 1.40, 1.50, 2.00, 2.15, 4.00 };
		double[] departure = new double[] { 1.10, 3.00, 2.20, 2.30, 3.15, 6.00 };
		int minNumOfPlateforms = getMinNumOfPlateforms(arrival, departure);
		System.out.println(minNumOfPlateforms);

	}

	private static int getMinNumOfPlateforms(double[] arrival, double[] departure) {
		Arrays.sort(arrival);
		Arrays.sort(departure);
		int plateformNeeded = 0;
		int maxPlateforms = 0;
		int i = 0;
		int j = 0;
		int n = arrival.length;

		while (i < n && j < n) {
			if (arrival[i] < departure[j]) {
				plateformNeeded++;
				i++;
				if (plateformNeeded > maxPlateforms) {
					maxPlateforms = plateformNeeded;
				}
			} else {
				plateformNeeded--;
				j++;
			}
		}

		return maxPlateforms;
	}

}
