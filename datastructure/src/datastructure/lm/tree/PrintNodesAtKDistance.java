package datastructure.lm.tree;

import java.util.Scanner;

import datastructure.lm.tree.utility.Node;
import datastructure.lm.tree.utility.TreeUtility;

public class PrintNodesAtKDistance {

	static Node root;

	public PrintNodesAtKDistance(int data) {
		root = new Node(data);
	}

	public static void main(String[] args) {
		root = TreeUtility.prepareTree(root);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter k");
		int k = s.nextInt();
		printNodesAtKDistance(root, k);
		s.close();
	}

	private static void printNodesAtKDistance(Node root, int k) {
		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.print(root.data + " ");
			return;
		}

		printNodesAtKDistance(root.left, k - 1);
		printNodesAtKDistance(root.right, k - 1);
	}

}
