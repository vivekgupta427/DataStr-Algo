package datastructure.lm.tree.bst;

import datastructure.lm.tree.utility.Node;
import datastructure.lm.tree.utility.TreeUtility;

public class SearchMinValueNodeInBST {

	static Node root;

	public SearchMinValueNodeInBST(int data) {
		root = new Node(data);
	}

	public SearchMinValueNodeInBST() {
		root = null;
	}

	public static void main(String[] args) {
		root = TreeUtility.prepareBST(root);
		TreeUtility.inOrderTraverse(root);
		System.out.println();
		Node node = searchMinValue(root);
		
		System.out.println("Min Value: " + node.data);
		
		System.out.println();
		TreeUtility.insertNodeInBST(root, 1);
		System.out.println();
		TreeUtility.inOrderTraverse(root);
		node = searchMinValue(root);
		System.out.println("Min Value: " + node.data);

	}

	private static Node searchMinValue(Node root) {
		if (root == null) {
			return root;
		}
		if (root.left == null) {
			return root;
		}
		return searchMinValue(root.left);

	}
	
	

}
