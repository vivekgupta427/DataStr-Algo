
package datastructure;

public class StringPerutations {

	public static void main(String[] args) {

		String str = "ABC";
		Permutation perm = new Permutation();
		perm.permute(str, 0, str.length() - 1);
	}

}

class Permutation {
	public void permute(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	private String swap(String str, int l, int r) {
		char[] charArray = str.toCharArray();
		char ch = charArray[l];
		charArray[l] = charArray[r];
		charArray[r] = ch;

		return String.valueOf(charArray);
	}
}
