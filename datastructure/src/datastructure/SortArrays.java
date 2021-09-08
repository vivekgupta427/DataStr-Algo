package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SortArrays {

	public static void main(String[] args) throws IOException {

		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;

		while ((line = in.readLine()) != null) {
			System.out.println(line);

			String[] split = line.split(";");

			char[] charArray1 = split[0].toCharArray(); //// 1,5,7,4;3,7,2,6,8
			char[] charArray2 = split[1].toCharArray();

			char[] finalcharArray1 = new char[charArray1.length];
			char[] finalcharArray2 = new char[charArray2.length];
			int i = 0;
			for (char ch : charArray1) {
				if (ch != ' ' && ch != ',') {
					finalcharArray1[i++] = ch;
				}
			}
			i = 0;
			for (char ch : charArray2) {
				if (ch != ' ' && ch != ',') {
					finalcharArray2[i++] = ch;
				}
			}

			char[] charArray3 = String.valueOf(finalcharArray1).trim().toCharArray();
			char[] charArray4 = String.valueOf(finalcharArray2).trim().toCharArray();

			char[] finalArray = new char[charArray3.length + charArray4.length];
			mergeArrays(charArray3, charArray4, charArray3.length, charArray4.length, finalArray);

			for (int k = 0; k < finalArray.length; k++) {
				System.out.print(finalArray[k] + " ");
			}

		}

	}

	public static void mergeArrays(char[] arr1, char[] arr2, int n1, int n2, char[] arr3) {
		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) { // 1,5,7,4 //3,7,2,6,8
			if (arr1[i] % 2 != 0 && arr2[j] % 2 != 0) {
				if (arr1[i] < arr2[j]) {
					arr3[k++] = arr1[i++];
				} else {
					arr3[k++] = arr1[j++];
				}
			} else if (arr1[i] % 2 != 0 && arr2[j] % 2 == 0) {
				arr3[k++] = arr1[i++];
			} else if (arr1[i] % 2 == 0 && arr2[j] % 2 != 0) {
				if (arr1[i] < arr2[j]) {
					arr3[k++] = arr1[j++];
				}
			} else if (arr1[i] % 2 == 0 && arr2[j] % 2 == 0) {
				if (arr1[i] < arr2[j]) {
					arr3[k++] = arr1[i++];
				} else {
					arr3[k++] = arr1[j++];
				}
			}
		}

		while (i < n1)
			arr3[k++] = arr1[i++];
		while (j < n2)
			arr3[k++] = arr2[j++];
	}

}
