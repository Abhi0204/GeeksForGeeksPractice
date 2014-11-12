package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNodesatKdistance {

	

	public void getNodesatKdistance(Node root,int k,int count)
	{
		if(root==null)
			return;
		if(count==k)
			System.out.println(root.data);

		getNodesatKdistance(root.leftChild,k,count+1);
		getNodesatKdistance(root.rightChild,k,count+1);

	}


	public void getNodesatKdistance(Node root,int k)
	{
		if(root==null)
			return;
		Queue<Node> myQueue=new LinkedList<Node>();
		myQueue.add(root);
		myQueue.add(null);
		int level=0;
		while(!myQueue.isEmpty())
		{
			if(level==k)
			{
				while(myQueue.peek()!=null)
				{
					Node newNode=myQueue.remove();
					System.out.print(newNode.data+" ");
				}
			}
			
			Node temp=myQueue.remove();
			if(temp==null)
			{
				if(!myQueue.isEmpty())
					myQueue.add(null);
			    	level++;
			}
			else
			{
				if(temp.leftChild!=null)
					myQueue.add(temp.leftChild);
				if(temp.rightChild!=null)
					myQueue.add(temp.rightChild);
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

		PrintNodesatKdistance print=new PrintNodesatKdistance();
		print.getNodesatKdistance(root,2);
	}

}
