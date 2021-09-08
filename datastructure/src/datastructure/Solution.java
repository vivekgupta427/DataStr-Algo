package datastructure;

import java.io.IOException;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//int num = Integer.parseInt(reader.readLine().trim());
		Object o ;
		
		//Solution.Private1 private1 = new Solution.Private1();
		
		////o = private1.new Private1();
		//System.out.println(num + " is " + ((Solution.Private1) o).powerof2(num));
		
		
		/////System.out.println("An instance of class: "+ o.getClass().getSimpleName()+ " has been created.");
		
	}
	class Private1 {
		private String powerof2(int num) {
			return ((num & num-1)==0)? "power of 2 ": "not a power of 2";
		}
	}

}
