package BinaryTree;

public class MinimumNode {

	
	public int findMinimum(Node root)
	{
		if(root==null)
			return Integer.MAX_VALUE;
		if(root.leftChild==null && root.rightChild==null)
			return root.data;
		
		int leftChild=findMinimum(root.leftChild);
		int rightChild=findMinimum(root.rightChild);
		
		return Math.min(root.data ,Math.min(leftChild, rightChild));
	}
	
	public int findMaximum(Node root)
	{
		if(root==null)
			return 0;
		if(root.leftChild==null && root.rightChild==null)
			return root.data;
		
		int leftChild=findMaximum(root.leftChild);
		int rightChild=findMaximum(root.rightChild);
		
		return Math.max(root.data ,Math.max(leftChild, rightChild));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(100);
		root.leftChild = new Node(102);
		root.leftChild.leftChild = new Node(30);
		root.leftChild.rightChild = new Node(41);
		root.rightChild = new Node(52);
		root.rightChild.leftChild = new Node(61);
		root.rightChild.leftChild.rightChild = new Node(94);
		root.rightChild.leftChild.leftChild = new Node(7);
		root.rightChild.rightChild = new Node(8);
		
		
		MinimumNode min=new MinimumNode();
		System.out.println(min.findMaximum(root));
		System.out.println("\n");
		System.out.println(min.findMinimum(root));
	}

}
