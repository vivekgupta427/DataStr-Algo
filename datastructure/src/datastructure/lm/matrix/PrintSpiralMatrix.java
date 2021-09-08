package datastructure.lm.matrix;

public class PrintSpiralMatrix {

	public static void main(String[] args) {
										  //	k        m	
		int [][] mat = new int[4][4];     //     0  1  2  3
		int num =1;						  //n 0  1  2  3  4
 		for(int i=0;i<4;i++) {			 //   1  5  6  7  8   
			for(int j=0;j<4;j++) {		 //   2  9 10 11 12
				mat[i][j] = num++;		 //p  3  13 14 15 16
			}
		}
 		
 		printElementsInSpiralFormat(mat);
		
	}
	
	private static void printElementsInSpiralFormat(int[][] mat) {
		int k = 0;
		int m = 3;
		int n = 0;
		int p = 3;

		while (k < m) {
			int i = k;
			for (int j = k; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}

			int j = m;
			for (i = n; i < p; i++) {
				System.out.print(mat[i][j] + " ");
			}

			i = p;
			for (j = m; j > k; j--) {
				System.out.print(mat[i][j] + " ");
			}

			j = k;
			for (i = p; i > n; i--) {
				System.out.print(mat[i][j] + " ");
			}

			k++;
			m--;
			n++;
			p--;

		}
	}

}
