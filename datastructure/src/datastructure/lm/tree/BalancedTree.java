/**
 * 
 */
package datastructure.lm.tree;

import datastructure.lm.tree.utility.Node;

/**
 * Find if the given tree is balanced or not
 * 
 * @author Vivek-PC
 *
 */
public class BalancedTree {

	static Node root;

	public BalancedTree(int data) {
		root = new Node(data);
	}

	public BalancedTree() {
		root = null;
	}

	private Node prepareTree(Node root) {
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

	private boolean isTreeBalanced(Node root) {
		if (root == null) {
			return true;
		}

		int left = findLeftSubtreeHeight(root.left);
		int right = findRightSubtreeHeight(root.right);

		if (Math.abs(left - right) <= 1 && isTreeBalanced(root.left) && isTreeBalanced(root.right)) {
			return true;
		}

		return false;
	}

	private int findRightSubtreeHeight(Node node) {
		int height = 0;
		Node temp = node;
		while (temp != null && temp.right != null) {
			temp = temp.right;
			height++;
		}
		return height;
	}

	private int findLeftSubtreeHeight(Node node) {
		int height = 0;
		Node temp = node;
		while (temp != null && temp.right != null) {
			temp = temp.left;
			height++;
		}
		return height;
	}
	
	
	private static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		BalancedTree tree = new BalancedTree();
		root = tree.prepareTree(BalancedTree.root);
		inOrder(root);
		
		boolean treeBalanced = tree.isTreeBalanced(BalancedTree.root);
		if (treeBalanced) {
			System.out.println("Tree is balalnced");
		} else {
			System.out.println("Tree is not balalnced");
		}
	}

}
