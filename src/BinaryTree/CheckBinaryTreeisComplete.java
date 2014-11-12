package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


public class CheckBinaryTreeisComplete {

	public boolean checkBinaryTreeisComplete(Node root)
	{
		Queue<Node> myQueue=new LinkedList<Node>();

		int maxLevel=getTreeHieght(root);
		myQueue.add(root);
		myQueue.add(null);
		int level=0;
		int count=0;

		while(!myQueue.isEmpty())
		{
			Node temp=myQueue.remove();
			if(temp==null ){
				if(!myQueue.isEmpty())
					myQueue.add(null);
				if(Math.pow(2, level)!=count && level!=maxLevel)
					return false;
				else
				{
					level++;
					count=0;
				}
			}
			else
			{
				if(temp.leftChild!=null)
					myQueue.add(temp.leftChild);
				if(temp.rightChild!=null)
					myQueue.add(temp.rightChild);
				count++;
			}
		}

		return true;
	}

	public int getTreeHieght(Node root)
	{
		if(root==null)
			return 0;

		return 1+(Math.max(getTreeHieght(root.leftChild),getTreeHieght(root.rightChild)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.leftChild=new Node(2);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(5);
		root.rightChild.leftChild=new Node(6);
		//root.rightChild.leftChild.rightChild=new Node(9);
		//root.rightChild.leftChild.leftChild=new Node(7);
		root.rightChild.rightChild=new Node(8);

		CheckBinaryTreeisComplete check=new CheckBinaryTreeisComplete();
		boolean flag=check.checkBinaryTreeisComplete(root);
		if(flag)
			System.out.println("Tree is a complete Binary Tree");
		else
			System.out.println("Tree is not a complete Binary Tree");
	}

}
