package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOFaTree {

	public void printLeftViewOfATree(Node root,int[] arr,int level)
	{
		if(root==null)
			return;
		
		if(arr[0]<level)
		{
			System.out.println(root.data);
			arr[0]=level;
		}
		printLeftViewOfATree(root.leftChild, arr, level+1);
		printLeftViewOfATree(root.rightChild, arr, level+1);


	}
	
	
	public void printRightViewOfATree(Node root,int[] arr,int level)
	{
		if(root==null)
			return;
		
		if(arr[0]<level)
		{
			System.out.println(root.data);
			arr[0]=level;
		}
		printRightViewOfATree(root.rightChild, arr, level+1);

		printRightViewOfATree(root.leftChild, arr, level+1);


	}
	
	
	public void printLeftViewIterative(Node root)
	{
		Queue<Node> myQueue=new LinkedList<Node>();
		myQueue.add(root);
		myQueue.add(null);
		
		System.out.print(root.data+" ");
		while(!myQueue.isEmpty())
		{
			Node temp=myQueue.remove();
			if(temp==null)
			{
				if(!myQueue.isEmpty())
				{	myQueue.add(null);
				
					System.out.print(myQueue.peek().data+" ");
				}
			}
			else
			{
				if(myQueue.peek()==null)
					System.out.println(temp.data);
				if(temp.leftChild!=null)
					myQueue.add(temp.leftChild);
				if(temp.rightChild!=null)
					myQueue.add(temp.rightChild);
			}
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
		
		LeftViewOFaTree left=new LeftViewOFaTree();
		int[] arr=new int[1];
		arr[0]=0;
		left.printLeftViewOfATree(root,arr,1);
		System.out.println("\n");
		
		//left.printLeftViewIterative(root);
		
	}

}
