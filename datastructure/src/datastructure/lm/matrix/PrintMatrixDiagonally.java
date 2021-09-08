package datastructure.lm.matrix;

public class PrintMatrixDiagonally {

	public static void main(String[] args) {
		
		int [][] mat = new int[4][4];     //    	 0  1  2  3
		int num =1;						  //n 0 	 1  2  3  4
 		for(int i=0;i<4;i++) {			 //   1 	 5  6  7  8   
			for(int j=0;j<4;j++) {		 //   2 	 9 10 11 12
				mat[i][j] = num++;		 //p  3 	 13 14 15 16
			}
		}
 		
 		printElementsDiagonally(mat, 4,4);
 		
	}
	
	private static void printElementsDiagonally(int[][] mat, int m, int n) {

		for (int k = 0; k < m; k++) {
			int i = k;
			int j = 0;

			while (i >= 0) {
				System.out.print(mat[i][j] + " ");
				i = i - 1;
				j = j + 1;
			}
		}

		for (int k = 1; k < n; k++) {
			int i = m - 1;
			int j = k;

			while (j < n) {
				System.out.print(mat[i][j] + " ");
				i = i - 1;
				j = j + 1;
			}
		}

	}

}
