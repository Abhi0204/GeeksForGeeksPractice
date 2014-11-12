package BinaryTree;

import java.util.*;

public class CheckAllLEavesAtSameLevel {

	public boolean checkLeavesAtSameLevel(Node root)
	{
		Queue<Node> myQueue=new LinkedList<Node>();
		myQueue.add(root);
		myQueue.add(null);
		int count=0;
		while(!myQueue.isEmpty())
		{
			Node temp=myQueue.remove();
			
			if(temp!=null)
			{
				if(count>0)
					return false;
				
				if(temp.leftChild==null && temp.rightChild==null)
					count=count+1;
				
				if(temp.leftChild!=null)
					myQueue.add(temp.leftChild);
				if(temp.rightChild!=null)
					myQueue.add(temp.rightChild);	
				
			}
			
			else
			{
				if(!myQueue.isEmpty())
					myQueue.add(null);
			}
		}
		
		return true;
	}
	
	public boolean checkAllLeaf(Node root,int level,int[] max)
	{
		if(root==null)
			return true;
		if(root.leftChild==null&& root.rightChild==null)
		{
			if(max[0]==-1)
			{
				max[0]=level;
				return true;
			}
			if(level==max[0])
				return true;
			return false;
		}
		
		return checkAllLeaf(root.leftChild, level+1, max)&&checkAllLeaf(root.rightChild, level+1, max);
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
		
		CheckAllLEavesAtSameLevel check=new CheckAllLEavesAtSameLevel();
		System.out.println(check.checkLeavesAtSameLevel(root));
		
		int[] arr=new int[1];
		arr[0]=-1;
		System.out.println(check.checkAllLeaf(root, 0, arr));
		
		
	}

}
