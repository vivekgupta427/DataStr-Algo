package datastructure.lm.tree;

import datastructure.lm.tree.utility.Node;

public class FindDiffOddEvenLevelNodes {

	Node root = null;

	public FindDiffOddEvenLevelNodes(int data) {
		root = new Node(data);
		root.left = null;
		root.right = null;
	}

	public FindDiffOddEvenLevelNodes() {
		root = null;
	}

	private static Node prepareTree() {
		FindDiffOddEvenLevelNodes tree = new FindDiffOddEvenLevelNodes();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		return tree.root;
	}

	private static int findDifference(Node root) {
		if (root == null) {
			return 0;
		} else {
			return root.data - findDifference(root.left) - findDifference(root.right);
		}

	}

	public static void main(String[] args) {
		Node tree = prepareTree();
		System.out.println("Difference: " + findDifference(tree));
	}

}
