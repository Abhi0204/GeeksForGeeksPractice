package BinaryTree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BoundaryLevelTraversal {

	HashSet<Integer> myhash=new HashSet<Integer>();
	public void BoundaryTraversal(Node root) {
		Queue<Node> myQueue = new LinkedList<Node>();
		Stack<Node> myStack = new Stack<Node>();

		System.out.print(root.data + " ");
		myQueue.add(null);
		if (root.leftChild != null)
			myQueue.add(root.leftChild);
		if (root.rightChild != null)
			myQueue.add(root.rightChild);
		while (!myQueue.isEmpty()) {
			Node temp = myQueue.remove();

			if (temp == null) {
				if (!myQueue.isEmpty()) {
					myQueue.add(null);
					System.out.print(myQueue.peek().data + " ");

				}
			} else {
				if (myQueue.peek() == null)
					myStack.push(temp);

				if (temp.leftChild != null)
					myQueue.add(temp.leftChild);
				if (temp.rightChild != null)
					myQueue.add(temp.rightChild);
			}
		}

		while (!myStack.isEmpty())
			System.out.print(myStack.pop().data + " ");
	}


	public void printBoundaryLLeft(Node root,int level,int[] maxlevel)
	{
		if(root==null)
			return;
		if(level>maxlevel[0])
		{
			if(!myhash.contains(root.data))
				System.out.print(root.data+" ");

			myhash.add(root.data);

			maxlevel[0]=level;
		}


		printBoundaryLLeft(root.leftChild, level+1, maxlevel);
		printBoundaryLLeft(root.rightChild, level+1, maxlevel);
	}
	public void printBoundaryRight(Node root,int level,int[] maxlevel)
	{
		if(root==null)
			return;
	
		if(level>maxlevel[0])
		{
			if(!myhash.contains(root.data))
				System.out.print(root.data+" ");

			myhash.add(root.data);

			maxlevel[0]=level;
		}
		printBoundaryRight(root.rightChild, level+1, maxlevel);
		
		printBoundaryRight(root.leftChild, level+1, maxlevel);
		

	}




	public void printBoundary(Node root,int level,int[] maxLevel)
	{
		if(root==null)
			return;

		printBoundaryLLeft(root, level, maxLevel);
		maxLevel[0]=0;
		printBoundaryRight(root, level, maxLevel);
	}
	
	
	public void printBoundaryLevelLeft(Node root)
	{
		if(root==null)
			return;
		if(root.leftChild!=null)
		{
			System.out.print(root.data+" ");
		printBoundaryLevelLeft(root.leftChild);
		}
		else if(root.rightChild!=null)
		{
			System.out.print(root.data+" ");
			printBoundaryLevelLeft(root.rightChild);
		}
	}
	
	public void printAllLeaf(Node root)
	{
		if(root==null)
			return;
		if(root.leftChild==null && root.rightChild==null)
			System.out.print(root.data+" ");
		
		printAllLeaf(root.leftChild);
		printAllLeaf(root.rightChild);
	}
	public void printBoundaryLevelRight(Node root)
	{
		if(root==null)
			return;
		
		 if(root.rightChild!=null)
		{
			printBoundaryLevelRight(root.rightChild);
			System.out.print(root.data+" ");

		}
		 else if(root.leftChild!=null)
		{
		printBoundaryLevelRight(root.leftChild);
		System.out.print(root.data+" ");

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

		BoundaryLevelTraversal boundary = new BoundaryLevelTraversal();
		//boundary.BoundaryTraversal(root);
		System.out.println("\n");
		int[] max=new int[1];
		max[0]=0;
       boundary.printBoundaryLevelLeft(root);
       boundary.printAllLeaf(root);
       boundary.printBoundaryLevelRight(root);

	}

}
