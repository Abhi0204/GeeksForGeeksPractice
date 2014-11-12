package BinarySearchTree;

import java.util.Queue;

import LinkedList.LinkedList;

public class CheckBTisaBST {

	public static Node root=null;
	Queue<Node> myqueue= new java.util.LinkedList<Node>();
	public Node insertBSt(Node root,Node node)
	{
		if(root==null)
		{
			node.leftChild=null;
			node.rightChild=null;
			return node;
		}

		if(node.data>root.data)
			root.rightChild=insertBSt(root.rightChild,node);
		else if(node.data<root.data)
			root.leftChild=insertBSt(root.leftChild,node);

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

	
	public boolean isThisABST(Node root,int[] prev)
	{
	if (root==null)
		return true;
	
	isThisABST(root.leftChild, prev);
	if(prev[0]<root.data)
	{
		prev[0]=root.data;
		return 	isThisABST(root.rightChild, prev);

	}
	
	return false;

	
	
	}
	
	public void checkBST(Node root,int[] index,int[] arr)

	{
		if(root==null)
			return;
		checkBST(root.leftChild, index, arr);
		arr[index[0]]=root.data;
		index[0]=index[0]+1;
		checkBST(root.rightChild, index, arr);
		
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
			Node eight=new Node(50);
			Node ninth=new Node(40);
			Node tenth=new Node(55);
			Node eleven=new Node(58);
			Node twel=new Node(54);

			
			Node root2=new Node(100);
			root2.leftChild=new Node(90);
			root2.rightChild=new Node(111);
			root2.leftChild.leftChild=new Node(186);
			CheckBTisaBST insert=new CheckBTisaBST();

			root=first;
			insert.insertBSt(root,second);

			insert.insertBSt(root,third);
			insert.insertBSt(root,fourth);
			insert.insertBSt(root,fifth);
			insert.insertBSt(root,sixth);
			insert.insertBSt(root,seventh);
			insert.insertBSt(root,eight);
			insert.insertBSt(root,ninth);
			insert.insertBSt(root,tenth);
			insert.insertBSt(root,eleven);
			insert.insertBSt(root,twel);
			

			insert.inorder(root);
			
			System.out.println("\n");
int[] prev=new int[1];
prev[0]=Integer.MIN_VALUE;
			System.out.println(insert.isThisABST(root2,prev));
			/*int[] arr=new int[12];
			int[] index=new int[1];
			insert.checkBST(root, index, arr);
			
			for(int i:arr)
				System.out.println(i);*/
			

		}

	}
