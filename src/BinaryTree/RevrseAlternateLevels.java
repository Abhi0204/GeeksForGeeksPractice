package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RevrseAlternateLevels {


	public void ReverseAlternateNodes(Node root)
	{
		Queue<Node> myQueue=new LinkedList<Node>();
		Stack<Node> myStack=new Stack<Node>();


		myQueue.add(root.leftChild);
		myQueue.add(root.rightChild);
		myQueue.add(null);
		myStack.push(root);
		int level=1;
		Node leftChild=null;
		Node rightChild=null;

	}
		public void inorder(Node root)
		{
			if(root==null)
				return ;
			inorder(root.leftChild);
			System.out.print(root.data+"->");
			inorder(root.rightChild);
		}
		public static void main(String[] args) {

			Node root=new Node(1);
			root.leftChild=new Node(2);
			root.leftChild.leftChild=new Node(3);
			root.leftChild.leftChild.leftChild=new Node(4);
			root.leftChild.leftChild.rightChild=new Node(5);

			root.leftChild.rightChild=new Node(6);
			root.leftChild.rightChild.leftChild=new Node(7);
			root.leftChild.rightChild.rightChild=new Node(8);


			root.rightChild=new Node(9);
			root.rightChild.leftChild=new Node(10);
			root.rightChild.leftChild.rightChild=new Node(12);
			root.rightChild.leftChild.leftChild=new Node(11);
			root.rightChild.rightChild=new Node(13);
			root.rightChild.rightChild.leftChild=new Node(14);
			root.rightChild.rightChild.rightChild=new Node(15);




			RevrseAlternateLevels reverse=new RevrseAlternateLevels();
			reverse.inorder(root);
			System.out.println("\n");
			reverse.ReverseAlternateNodes(root);
			reverse.inorder(root);

		}
	}
