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

	public boolean checkBst(Node root)
	{
		if(root==null)
			return false;
		myqueue.add(root);
		System.out.println("Level Order Traversal");

		while(myqueue.isEmpty()==false)
		{
		
			System.out.print(myqueue.peek().data+ " ");
			if(myqueue.peek().leftChild!=null && myqueue.peek().rightChild!=null)
			{
				
				if(myqueue.peek().leftChild.data<myqueue.peek().data && myqueue.peek().rightChild.data>myqueue.peek().data)
				{
					
					myqueue.add(myqueue.peek().leftChild);
					myqueue.add(myqueue.peek().rightChild);
					myqueue.poll();

				}
				else 
					return false;
			}
			else if(myqueue.peek().leftChild==null && myqueue.peek().rightChild!=null)
			{
				if(myqueue.peek().rightChild.data>myqueue.peek().data)
				{
					myqueue.add(myqueue.peek().rightChild);
					myqueue.poll();

				}
				else
					return false;
			}
			else if(myqueue.peek().leftChild!=null && myqueue.peek().rightChild==null)
			{
				if(myqueue.peek().leftChild.data<myqueue.peek().data)
				{
					myqueue.add(myqueue.peek().leftChild);
					myqueue.poll();

				}
				else
					return false;
			}
			
			else if(myqueue.peek().leftChild==null && myqueue.peek().rightChild==null)
				myqueue.poll();
			
		}
		
		System.out.println("\n");
		return true;

		}
	
	public boolean isThisABST(Node mynode)
	{
	if (mynode==null)
		return true;

	if (mynode.leftChild!=null && mynode.leftChild.data> mynode.data)
	return false;

	if (mynode.rightChild!=null && mynode.rightChild.data <= mynode.data)
	return false;

	return (isThisABST(mynode.leftChild) && isThisABST(mynode.rightChild));
	//return true;

	//return false;
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
			root2.leftChild=new Node(111);
			root2.rightChild=new Node(90);
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

			System.out.println(insert.isThisABST(root));

		}

	}
