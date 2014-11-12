package BinaryTree;

import java.util.Queue;

import java.util.*;

public class DownNextTree {

	public Node ConvertTree(Node root)
	{
		Queue<Node> myqueue=new LinkedList<Node>();
		myqueue.add(root);
		myqueue.add(null);
		
		Node parent=root;
		while(!myqueue.isEmpty())
		{
			Node temp=myqueue.remove();
			if(temp!=null)
			{
				temp.next=myqueue.peek();
				if(temp.leftChild!=null)
					myqueue.add(temp.leftChild);
				if(temp.rightChild!=null)
					myqueue.add(temp.rightChild);		
			}
			else
			{
				if(!myqueue.isEmpty())
				{
					myqueue.add(null);
					parent.down=myqueue.peek();
					parent=myqueue.peek();
				}
			}
	
		}
		return root;
	}
	
	public void traverseTreeDown(Node root)
	{
		Node current=root;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			if(current.next!=null)
			System.out.print(current.next.data);
			System.out.println();
			current=current.down;
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
		
		DownNextTree next=new DownNextTree();
		next.traverseTreeDown(next.ConvertTree(root));
	}

}
