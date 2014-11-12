package BinaryTree;

import java.util.Stack;

public class TreeTraversal {

	static int count=0;
	boolean flag=false;
	public void inorderTraversal(Node root)
	{
		while(true)
		{
		if(root==null)
		{
			return;
		}
		inorderTraversal(root.leftChild);
		System.out.print(root.data+"->");
		root=root.rightChild;
		}

	}
	public void preorderTraversal(Node root)
	{
		while(true)
		{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+"->");
		preorderTraversal(root.leftChild);

		root=root.rightChild;
		}
	}

	public void postorderTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}

		postorderTraversal(root.leftChild);

		postorderTraversal(root.rightChild);
		System.out.print(root.data+"->");
		

	}

	int size(Node node) 
	{  
		if (node==null)
			return 0;
		else  
			return(size(node.leftChild)+1+size(node.rightChild));

	}

	public int checkiDentical(Node node,Node node1)
	{

		if(node==null && node1==null)
			return 0;

		if(node.data==node1.data)
		{
			int left=checkiDentical(node.leftChild, node1.leftChild);
			if(left==0)
				return checkiDentical(node.rightChild, node1.rightChild);


		}

		return -1;


		/*
		if (flag==true)
		return -1;

		else 
			return 0;*/
	}

	public void findInorder(Node root)
	{
		Stack<Node> mystack=new Stack<Node>();

		Node current=root;

			while(current!=null||!mystack.isEmpty())
			{
	           if(current!=null)
	           {
	        	   mystack.push(current);
	        	   current=current.leftChild;
	           }
	           else
	           {
	        	   Node temp=mystack.pop();
	        	   System.out.print(temp.data+"->");
	        	   current=temp.rightChild;
	           }
		
		}
	}
	public void findpreOrder(Node root)
	{
		Stack<Node> mystack=new Stack<Node>();

		Node current=root;
		mystack.push(current);
		while(!mystack.isEmpty())
		{
             current=mystack.pop();
             System.out.print(current.data+"->");
             
             if(current.rightChild!=null)
            	 mystack.push(current.rightChild);
             if(current.leftChild!=null)
            	 mystack.push(current.leftChild);
		}
		}
	
	public void findpostOrder(Node root)
	{
		Stack<Node> mystack=new Stack<Node>();

		Node current=root;
		mystack.push(current);
		while(!mystack.isEmpty())
		{
            Node next=mystack.peek();
            if(next.leftChild==null && next.rightChild==null ||next.leftChild==root||next.rightChild==root)
            {
            	mystack.pop();
            	System.out.print(next.data+"->");
            	root=next;
            }
            else
            {
            	if(next.rightChild!=null)
            		mystack.push(next.rightChild);
            	if(next.leftChild!=null)
            		mystack.push(next.leftChild);
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

		TreeTraversal firstTree=new TreeTraversal();
		firstTree.inorderTraversal(root);
		System.out.println("\n");
		firstTree.preorderTraversal(root);
		System.out.println("\n");
		firstTree.postorderTraversal(root);
		System.out.println("\n");
		//System.out.println(count);

		TreeTraversal secondTree=new TreeTraversal();
		Node rootnew=new Node(1);
		rootnew.leftChild=new Node(2);
		rootnew.leftChild.leftChild=new Node(31);
		rootnew.leftChild.rightChild=new Node(4);
		rootnew.rightChild=new Node(5);
		rootnew.rightChild.leftChild=new Node(6);
		System.out.println(secondTree.size(rootnew));

		int no=secondTree.checkiDentical(root, rootnew);
		secondTree.inorderTraversal(rootnew);
		System.out.println("\n");
		if(no==-1)
			System.out.println("Trees not identical");
		else
			System.out.println("Trees are identical");
		
		firstTree.findInorder(root);
		System.out.println("\n");
		firstTree.findpreOrder(root);
		System.out.println("\n");
		firstTree.findpostOrder(root);
	}

}
