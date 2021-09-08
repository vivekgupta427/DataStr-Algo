package datastructure.lm.stock;

import java.util.ArrayList;
import java.util.List;

public class StockProblem {

	public static void main(String[] args) {

		int[] arr = new int[] { 98, 178, 250, 300, 40, 540, 690 };
		System.out.println(findMaximumProfit(arr));

	}

	private static int findMaximumProfit(int[] arr) {
		int maxProfit = 0;
		List<Result> stocksList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			Result result = new Result();
			while (i < arr.length - 1 && arr[i + 1] <= arr[i]) {
				i++;
			}

			if (i == (arr.length - 1)) {
				break;
			}
			result.buy = i;

			while (i < arr.length - 1 && arr[i + 1] >= arr[i]) {
				i++;
			}

			result.sell = i;

			stocksList.add(result);
		}

		for (Result res : stocksList) {
			maxProfit = maxProfit + (arr[res.sell] - arr[res.buy]);
		}
		return maxProfit;
	}

}

class Result {
	int buy;
	int sell;
}
