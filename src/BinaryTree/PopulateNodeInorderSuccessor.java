package BinaryTree;

import BinarySearchTree.InorderSuccessor;

public class PopulateNodeInorderSuccessor {

	
	public void populateIn(Node root,Node[] index)
	{
		if(root==null)
			return;

		populateIn(root.leftChild, index);
		if(index[0]==null)
			index[0]=root;
		else
		{
		index[0].next=root;
		index[0]=root;
		}
		populateIn(root.rightChild, index);

	}
	
	public Node findInorderSuccessor(Node root,int key,Node[] succ)
	{
		if(root==null)
			return null;
		
		if(root.data==key)
		{
			Node temp=root.rightChild;
			if(root.rightChild!=null)
			{
				while(temp!=null)
				{
					succ[0]=temp;
					temp=temp.leftChild;
				}
				
				return succ[0];
			}

		}
		
	     	succ[0]=root;
			Node left=findInorderSuccessor(root.leftChild,key,succ);
			if(left==null)
			return findInorderSuccessor(root.rightChild,key,succ);
			
			return left;
	}
	
	public void traverse(Node root)
	{
		Node curr=root;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
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
		
		PopulateNodeInorderSuccessor pop=new PopulateNodeInorderSuccessor();
		Node[] newNode=new Node[1];
		newNode[0]=null;
		
		pop.populateIn(root, newNode);
		pop.traverse(root.leftChild.leftChild);
		System.out.println("\n");
		newNode[0]=null;
		Node temp=pop.findInorderSuccessor(root, 4, newNode);
		System.out.println(temp.data);
		
	}

}
