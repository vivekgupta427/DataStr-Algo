package datastructure.hackerrank;

//Input format:
/*10 50
AND 1 2
XOR 1 2
XOR 1 2
AND 2 1
XOR 1 2
SET 1 1
SET 1 0
XOR 2 1
OR 1 2
FLIP 2 1
OR 2 1
FLIP 1 4
AND 1 2
OR 1 2
OR 2 1
XOR 1 2
SET 1 3
AND 1 2
SET 2 8*/

import java.util.BitSet;
import java.util.Scanner;

public class BitSetOperation {

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       int numOp = s.nextInt();
	       s.nextLine();
	       BitSet b1 = new BitSet(n);
	       BitSet b2 = new BitSet(n);
	       b1.set( 0,  n, false);
	       b2.set( 0,  n, false);
	       for(int i=0;i<numOp; i++){
	           String op = s.nextLine();
	           String []arr = op.split(" ");
	           String opName = arr[0];
	           int operand1 = Integer.parseInt(arr[1]);
	           int operand2 = Integer.parseInt(arr[2]);
	           if(opName.equalsIgnoreCase("AND")){
	               if(operand1==1){
	                   b1.and(b2);
	               } else{
	                   b2.and(b1);
	               }
	           } else if(opName.equalsIgnoreCase("OR")){
	                if(operand1==1){
	                   b1.or(b2);
	               } else{
	                   b2.or(b1);
	               }
	           }else if(opName.equalsIgnoreCase("XOR")){
	                if(operand1==1){
	                   b1.xor(b2);
	               } else{
	                   b2.xor(b1);
	               }
	           }else if(opName.equalsIgnoreCase("SET")){
	                if(operand1==1){
	                   b1.set(operand2);
	               } else{
	                   b2.set(operand2);
	               }
	           }else if(opName.equalsIgnoreCase("FLIP")){
	                if(operand1==1){
	                   b1.flip(operand2);
	               } else{
	                   b2.flip(operand2);
	               }
	           }
	           s.close();
	           System.out.println(b1.cardinality()+ " "+b2.cardinality());
	       }
	    }

}
