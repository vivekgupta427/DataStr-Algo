package datastructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberOfUniquePairs {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        int finalCount = 0;
        Set<String> pairSet = new HashSet<>();
        for(int i=0; i<t;i++){
            if (!pairSet.contains(pair_left[i]+" "+ pair_right[i])) {
                pairSet.add(pair_left[i]+" "+ pair_right[i]);
                finalCount = finalCount + 1;
                System.out.println(finalCount);
            } else {
            	System.out.println(finalCount);
            }
        }
        s.close();

   }
}