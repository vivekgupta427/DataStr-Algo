package datastructure.lm.digitarrangement;

public class FindDigitHavingLesserAndHigher {

	public static void main(String[] args) {
		
		//int [] arr = new int[] {6,2,5,4,5,9,11,13,10};
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int index = findIndexOfElement(arr);
		System.out.println(index);

	}
	
	private static int findIndexOfElement(int [] arr) {
		int max = arr[0];
		int i=1;
		for(i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
				break;
			}
		}
		
		int elementIndex = i;
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j] < max) {
				return -1;
			}
		}
		
		return elementIndex;
	}

}
