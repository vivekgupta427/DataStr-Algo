
public class Trie {

	static Node root;

	public Trie() {
		root = new Node('\0');
	}

	public static void insert(String word) {
		Node curr = root;
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.children[ch - 'a'] == null) {
				curr.children[ch - 'a'] = new Node(ch);
			}
			curr = curr.children[ch - 'a'];
		}

		curr.isWord = true;

	}

	public static boolean search(String word) {
		Node node = getNode(word);
		return node != null && node.isWord;
	}

	public static boolean startsWith(String prefix) {
		return getNode(prefix) != null;
	}

	private static Node getNode(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);

			if (curr.children[ch - 'a'] == null) {
				return null;
			}
			curr = curr.children[ch - 'a'];
		}

		return curr;
	}

	static class Node {
		char c;
		boolean isWord;
		Node[] children;

		public Node(char c) {
			this.c = c;
			isWord = false;
			children = new Node[26];
		}
	}

	public static void main(String[] args) {
		Trie root = new Trie();

		insert("abc");
		insert("abcd");
		insert("fgd");
		insert("goat");
		insert("search");

		System.out.println(search("goat"));
		System.out.println(startsWith("se"));
		System.out.println(startsWith("de"));
		System.out.println(search("abcf"));

	}

}
