package datastructure.hackerrank;

import java.util.Scanner;

/*Input 
17
9223372036854775808
9223372036854775807
-9223372036854775808
-9223372036854775807
4294967296
4294967295
-4294967296
-4294967295
65536
65535
-65536
-65535
256
255
-256
-255
12222222222222222222222222222222222222222221*/

public class JavaPremitiveDataTypes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numTestCases = scan.nextInt();

		for (int i = 0; i < numTestCases; i++) {
			try {
				long x = scan.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                } else{
                    System.out.println(x + " can't be fitted anywhere.");
                }

			} catch (Exception ex) {
				System.out.println(scan.next() + " can't be fitted anywhere.");
			}
		}
		scan.close();
	}

}
