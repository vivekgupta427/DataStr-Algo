import java.util.Arrays;

public class PlatformCount {

	public static void main(String[] args) {

		int[] arrival = new int[] { 900, 940, 950, 1100, 1500, 1800 };
		int[] dep = new int[] { 910, 1120, 1130, 1200, 1900, 2000 };

		int findMinNumOfPlateforms = findMinNumOfPlateforms(arrival, dep);
		System.out.println(findMinNumOfPlateforms);

	}

	private static int findMinNumOfPlateforms(int[] arr, int[] dep) {

		Arrays.sort(arr);
		Arrays.sort(dep);
		int platform_needed = 0;
		int maxPlatforms = 0;
		int i = 0;
		int j = 0;
		int n = arr.length;
		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				platform_needed++;
				i++;
				if (platform_needed > maxPlatforms) {
					maxPlatforms = platform_needed;
				}
			} else {
				platform_needed--;
				j++;
			}
		}

		return maxPlatforms;
	}

}
