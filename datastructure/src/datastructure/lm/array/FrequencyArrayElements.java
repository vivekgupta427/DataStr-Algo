package datastructure.lm.array;

public class FrequencyArrayElements {

	public static void main(String[] args) {

		int [] arr = new int[]{5,2,7,7,5,5,2};
		printFrequencyOfElements(arr);
		
	}
	
	private static void printFrequencyOfElements(int [] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			arr[i]--;
		}
		
		for(int i=0; i<n;i++) {
			arr[arr[i]%n] =  n + arr[arr[i]%n];
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Frequence of "+ (i+1) + " is " + arr[i]/n);
		}
	}

}
