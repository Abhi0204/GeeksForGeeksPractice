package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


public class ConnectNodesatSameLevel {

	public void ConnectNodesAtSameLevel(Node root) {

		Queue<Node> myQueue = new LinkedList<Node>();
		myQueue.add(root);
		myQueue.add(null);

		while (!myQueue.isEmpty()) {
			Node temp = myQueue.remove();

			if(temp!=null)
			{
				temp.nextRight=myQueue.peek();
				if (temp.leftChild != null)
					myQueue.add(temp.leftChild);
				if (temp.rightChild != null)
					myQueue.add(temp.rightChild);
			}
			else{
				if ( !myQueue.isEmpty()) {
					myQueue.add(null);
				}
			}

		}

	}
	public void getNodeConnect(Node root)
	{
		if(root==null)
			return;
		if(root.leftChild!=null)
			root.leftChild.next=root.rightChild;
		if(root.rightChild!=null)
			if(root.next!=null)
				root.rightChild.next=root.next.leftChild;
		getNodeConnect(root.leftChild);
		getNodeConnect(root.rightChild);
	}

	
	public void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.leftChild);
		System.out.print(root.data+"->");
		if(root.nextRight!=null)
			System.out.print(root.data+"---->"+root.nextRight.data+" ");
		inorder(root.rightChild);
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


		ConnectNodesatSameLevel connect=new ConnectNodesatSameLevel();

		connect.ConnectNodesAtSameLevel(root);
		connect.inorder(root);
		System.out.println("\n");
		connect.getNodeConnect(root);
		connect.inorder(root);


	}

}