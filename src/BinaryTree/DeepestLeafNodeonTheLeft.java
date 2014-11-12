package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeafNodeonTheLeft {

	public ArrayList<Node> getdeepestLeafNode(Node root) {
		Queue<Node> myQueue = new LinkedList<Node>();
		ArrayList<Node> myarr = new ArrayList<Node>();
		myQueue.add(root);
		myQueue.add(null);
		int level = 0;
		int max_level = 0;
		while (!myQueue.isEmpty()) {
			Node temp = myQueue.remove();

			if (temp != null) {
				if (temp.leftChild != null) {
					myQueue.add(temp.leftChild);
					if (level > max_level)
						myarr.clear();

					myarr.add(temp.leftChild);
					max_level = level;
				}
				if (temp.rightChild != null)
					myQueue.add(temp.rightChild);

			} else {
				if (myQueue.isEmpty() == false)
					myQueue.add(null);
				level = level + 1;
			}
		}
		return myarr;
	}

	public void PrintDeepestNodeOnLEft(Node root) {
		ArrayList<Node> arr = getdeepestLeafNode(root);
		for (Node i : arr) {
			System.out.println(i.data);
		}
	}

	public int printDeepLeafNode(Node root, int level, boolean flag,
			ArrayList<Node> arr, int maxLevel) {
		if (root == null)
			return maxLevel;

		if (flag == true) {
			if (maxLevel < level) {
				maxLevel = level;
				arr.clear();
				arr.add(root);
			} else if (maxLevel == level)
				arr.add(root);

		}
		int max = printDeepLeafNode(root.leftChild, level + 1, true, arr,
				maxLevel);
		int right=printDeepLeafNode(root.rightChild, level + 1, false, arr, max);

		return Math.max(right,max);
	}

	public int getHieght(Node root) {
		if (root == null)
			return -1;

		return 1 + Math.max(getHieght(root.leftChild),
				getHieght(root.rightChild));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.leftChild = new Node(2);
		root.leftChild.leftChild = new Node(3);
		root.leftChild.rightChild = new Node(4);
		root.rightChild = new Node(5);
		root.rightChild.leftChild = new Node(6);
		root.rightChild.leftChild.rightChild = new Node(9);
		root.rightChild.leftChild.leftChild = new Node(7);
		root.rightChild.rightChild = new Node(8);
		root.rightChild.leftChild.leftChild.leftChild = new Node(71);
		root.rightChild.rightChild.leftChild = new Node(81);
		root.rightChild.rightChild.leftChild.leftChild = new Node(19);

		DeepestLeafNodeonTheLeft deep = new DeepestLeafNodeonTheLeft();
		// deep.PrintDeepestNodeOnLEft(root);

		ArrayList<Node> myaar = new ArrayList<Node>();
		System.out.println(deep.printDeepLeafNode(root, 0, false, myaar, 0));
		for (Node i : myaar)
			System.out.println(i.data);
	}

}
