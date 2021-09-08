package datastructure.lm.array;

public class FindMajorityElement {

	public static void main(String[] args) {

		int [] arr = new int[] {2,3,3,2,2,5,3,3,1,3,3};
		int findMajorityElement = findMajorityElement(arr);
		System.out.println(findMajorityElement);
		
	}
	
	private static int findMajorityElement(int [] arr) {
		/*int majority = arr[0];
		int count =1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == majority) {
				count++;
			} else {
				count--;
				
			}
			
			if(count==0) {
				majority = arr[i];
				count=1;
			}		
			
		}
		return majority;*/
		
		int n= arr.length;
		for(int i=0;i<n;i++) {
			arr[i]--;
		}
		
		for(int i=0; i<n;i++) {
			arr[arr[i]%n] =  n + arr[arr[i]%n];
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]/n > n/2) {
				return (i+1);
			}
			//System.out.println("Frequence of "+ (i+1) + " is " + arr[i]/n);
		}
		return 0;
	}

}
