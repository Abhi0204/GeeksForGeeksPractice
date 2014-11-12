package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

	public void ReverseLevelOrderTraversa(Node root)
	{
		Stack<Node> myStack=new Stack<Node>();
		Queue<Node> myQueue=new LinkedList<Node>();

		myStack.push(root);
		myQueue.add(root);
		while(!myQueue.isEmpty())
		{
			Node temp=myQueue.remove();
			if(temp.rightChild!=null)
			{
				myQueue.add(temp.rightChild);
				myStack.push(temp.rightChild);
			}

			if(temp.leftChild!=null)
			{
				myQueue.add(temp.leftChild);
				myStack.push(temp.leftChild);
			}
		}

		while(!myStack.isEmpty())
		{
			System.out.print(myStack.pop().data+"->");
		}
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node root=new Node(1);
	root.leftChild=new Node(2);
	root.leftChild.leftChild=new Node(3);
	root.leftChild.rightChild=new Node(4);
	root.rightChild=new Node(5);
	root.rightChild.leftChild=new Node(6);
	root.rightChild.leftChild.rightChild=new Node(9);
	root.rightChild.leftChild.leftChild=new Node(7);
	root.rightChild.rightChild=new Node(8);

	ReverseLevelOrder levelorder=new ReverseLevelOrder();
	levelorder.ReverseLevelOrderTraversa(root);

}

}
