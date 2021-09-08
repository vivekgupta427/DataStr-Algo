package datastructure;

import java.util.Comparator;

public class FindAWord {

	public static void main(String[] args) {

		String[] arrayStrs = { "abc", "def", "efg", "fyh", "par" };
		// {‘abc’, ‘def’, ‘efg’, ‘fyh’, ‘’par’, ‘par’, ‘pqrst’};

		String word = "fyh";

		int index = findUsingBinarySearch(arrayStrs, word, 0, arrayStrs.length);
		System.out.println(index);

	}

	private static int findUsingBinarySearch(String[] arrayStrs, String word, int startingIndex, int last) {

		int mid = (startingIndex + last) / 2;

		if (word.equals(arrayStrs[mid])) {
			return mid;
			
		} else if (new WordComparator().compare(word, arrayStrs[mid]) < 0) {
			return findUsingBinarySearch(arrayStrs, word, startingIndex, mid-1);
		} else {
			return findUsingBinarySearch(arrayStrs, word, mid+1, last);
		}
	}

}

class WordComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o1.compareTo(o2);

	}

}
