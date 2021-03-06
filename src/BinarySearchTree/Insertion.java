package BinarySearchTree;

import BinarySearchTree.Node;

public class Insertion {	
	
	public Node insertBSt(Node root,Node node)
	{
		if(root==null)
		{
			root=node;
			return node;
		}
		if(root.data>node.data)
		  root.leftChild=insertBSt(root.leftChild, node);
		else
			root.rightChild=insertBSt(root.rightChild, node);	
		
		return root;
		
	}
	
	
	public void inorder(Node node)
	{
		if(node==null)
			return;
		inorder(node.leftChild);
		System.out.print(node.data+" ");
		inorder(node.rightChild);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node first=new Node(100);
		Node second=new Node(120);
		Node third=new Node(140);
		Node fourth=new Node(70);
		Node fifth=new Node(60);
		Node sixth=new Node(80);
		Node seventh=new Node(110);
		
		
		Insertion insert=new Insertion();
	
		Node root=first;
		insert.insertBSt(root,second);

		insert.insertBSt(root,third);
		insert.insertBSt(root,fourth);
		insert.insertBSt(root,fifth);
		insert.insertBSt(root,sixth);
		insert.insertBSt(root,seventh);

		insert.inorder(root);

	}

}
