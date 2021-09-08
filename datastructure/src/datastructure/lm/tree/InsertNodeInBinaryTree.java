/**
 * 
 */
package datastructure.lm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import datastructure.lm.tree.utility.Node;
import datastructure.lm.tree.utility.TreeUtility;


/**
 * Insert Node in Binary tree in level order
 * 
 * @author Vivek-PC
 *
 */
public class InsertNodeInBinaryTree {
	
	List<List<Integer>> list = new ArrayList<>();

	
	static Node root;

	public static void main(String[] args) {
		root = TreeUtility.prepareTree(root);
		TreeUtility.inOrderTraverse(root);
		insertNode(root, 99);
		System.out.println();
		TreeUtility.inOrderTraverse(root);

	}

	private static void insertNode(Node root, int key) {
		Node temp = root;

		if (temp == null) {
			new Node(key);
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(temp);

		while (!queue.isEmpty()) {
			temp = queue.peek();
			queue.remove();
			if (temp.left == null) {
				temp.left = new Node(key);
				break;
			} else {
				queue.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = new Node(key);
				break;
			} else {
				queue.add(temp.right);
			}

		}

	}

}
