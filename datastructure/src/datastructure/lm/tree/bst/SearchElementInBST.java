package datastructure.lm.tree.bst;

import datastructure.lm.tree.utility.Node;
import datastructure.lm.tree.utility.TreeUtility;

public class SearchElementInBST {

	static Node root;

	public static void main(String[] args) {
		root = TreeUtility.prepareBST(root);
		TreeUtility.inOrderTraverse(root);
		System.out.println();
		boolean searchElement = searchElement(root, 15);
		System.out.println("Item Found : " + searchElement);
		System.out.println();
		insertNode(root, 9);
		System.out.println();
		TreeUtility.inOrderTraverse(root);
	}

	private static boolean searchElement(Node root, int key) {
		if (root == null) {
			return false;
		}

		if (key == root.data) {
			return true;
		}

		if (key < root.data) {
			return searchElement(root.left, key);
		}

		return searchElement(root.right, key);
	}

	private static Node insertNode(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}
		if (key < root.data) {
			 root.left = insertNode(root.left, key);
		} else {
			root.right = insertNode(root.right, key);
		}
		return root;

	}

}
