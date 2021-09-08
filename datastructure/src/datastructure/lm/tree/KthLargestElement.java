package datastructure.lm.tree;

import datastructure.lm.tree.utility.Node;

public class KthLargestElement {

	Node root = null;
	static int count = 0;
	static int k = 3;

	public KthLargestElement(int data) {
		root = new Node(data);
	}

	public KthLargestElement() {
		root = null;
	}

	public static void main(String[] args) {
		Node root = prepareTree();
		findKthLargetElement(3, root);

	}

	private static Node prepareTree() {
		KthLargestElement tree = new KthLargestElement();

		tree.root = new Node(22);
		tree.root.left = new Node(14);
		tree.root.right = new Node(25);
		tree.root.left.left = new Node(13);
		tree.root.right.left = new Node(23);
		tree.root.right.right = new Node(32);
		tree.root.right.right.left = new Node(28);
		tree.root.right.right.right = new Node(40);
		tree.root.right.right.left.left = new Node(26);
		return tree.root;
	}

	private static void getInOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		getInOrderTraversal(root.right);
		count = count + 1;
		if (count == k) {
			System.out.print(root.data + " ");
		}
		getInOrderTraversal(root.left);

	}

	private static void findKthLargetElement(int k, Node root) {
		getInOrderTraversal(root);

	}

}
