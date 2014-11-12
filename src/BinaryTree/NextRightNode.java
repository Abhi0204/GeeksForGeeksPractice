package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightNode {
	public String findNextRightOfaGivenNode(Node root,int key)
	{

		Queue<Node> myQueue=new LinkedList<Node>();
		myQueue.add(root);
		myQueue.add(null);

		while(!myQueue.isEmpty())
		{
			Node temp=myQueue.remove();
		
			if(temp==null)
			{
				if(!myQueue.isEmpty())
					myQueue.add(null);

			}
			
			else
			{
				if(temp.data==key)
					{
					if(myQueue.peek()!=null)
					return Integer.toString(myQueue.peek().data);
					}
				if(temp.leftChild!=null)
					myQueue.add(temp.leftChild);
				if(temp.rightChild!=null)
					myQueue.add(temp.rightChild);
			}

		}
		
		return null;
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
		
	NextRightNode next=new NextRightNode();
	System.out.println(next.findNextRightOfaGivenNode(root,root.leftChild.rightChild.data));

	}

}
