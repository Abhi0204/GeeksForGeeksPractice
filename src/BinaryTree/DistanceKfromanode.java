package BinaryTree;

public class DistanceKfromanode {

	//Function to find the level of the node
	public int getTotalNoofNodes(Node root,Node node,int k)
	{

		if(root==null)
			return 0;
		
		if(root==node)
			return k;
		int temp=getTotalNoofNodes(root.leftChild, node, k+1);
	if(temp==0)
		return getTotalNoofNodes(root.rightChild, node, k+1);
	
		return temp;
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
		
		DistanceKfromanode distnace=new DistanceKfromanode();
		System.out.println(distnace.getTotalNoofNodes(root,root.rightChild.leftChild.rightChild,0));
	}

}
