package datastructure.lm.tree.utility;

public class TreeUtility {

	private TreeUtility() {
	}

	public static Node prepareTree(Node root) {

		if (root == null) {
			root = new Node(1);
		}
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		return root;
	}

	public static Node prepareBST(Node root) {
		if (root == null) {
			root = new Node(6);
		}
		root.left = new Node(4);
		root.right = new Node(10);
		root.left.right = new Node(5);
		root.right.left = new Node(8);
		root.right.right = new Node(12);
		root.right.right.left = new Node(11);
		root.right.right.right = new Node(15);
		return root;

	}

	public static void inOrderTraverse(Node root) {
		if (root == null) {
			return;
		}
		inOrderTraverse(root.left);
		System.out.print(root.data + " ");
		inOrderTraverse(root.right);
	}

	public static Node insertNodeInBST(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}

		if (key < root.data) {
			root.left = insertNodeInBST(root.left, key);
		}
		if (key > root.data) {
			root.right = insertNodeInBST(root.right, key);
		}

		return root;
	}

}
