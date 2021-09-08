package datastructure.lm.graph;

public class CelebrityProblem {

	static int[][] people = new int[][] { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };

	private static int knows(int a, int b) {
		return people[a][b];
	}

	private static int findCelebrity(int n) {
		int[] inDegree = new int[n];
		int[] outDegree = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int x = knows(i, j);
				inDegree[j] += x;
				outDegree[i] += x;
			}
		}

		for (int i = 0; i < n; i++) {
			if (inDegree[i] == n - 1 && outDegree[i] == 0) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int n=4;
		int find = findCelebrity(n);
		if(find == -1) {
			System.out.println("Celebrity not present");
		} else {
			System.out.println("Celebrity present with Id "+ find);
		}
	}

}
