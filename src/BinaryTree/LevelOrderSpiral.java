package BinaryTree;

import java.util.Stack;

public class LevelOrderSpiral {

	public void LevelOrderTraversalSpiral(Node root) {
		if (root == null)
			return;

		Stack<Node> firstStack = new Stack<Node>();
		Stack<Node> secondStack = new Stack<Node>();
		Node temp = null;
		firstStack.push(root);
		while (!firstStack.isEmpty() || !secondStack.isEmpty()) {
			while (!secondStack.isEmpty()) {
				temp = secondStack.pop();
				System.out.print(temp.data + "->");
				if (temp.leftChild != null)
					firstStack.push(temp.leftChild);
				if (temp.rightChild != null)
					firstStack.push(temp.rightChild);
			}
			while (!firstStack.isEmpty()) {
				temp = firstStack.pop();
				System.out.print(temp.data + "->");
				if (temp.rightChild != null)
					secondStack.push(temp.rightChild);
				if (temp.leftChild != null)
					secondStack.push(temp.leftChild);
			}
		}
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

		LevelOrderSpiral spiral=new LevelOrderSpiral();
		spiral.LevelOrderTraversalSpiral(root);

	}

}
