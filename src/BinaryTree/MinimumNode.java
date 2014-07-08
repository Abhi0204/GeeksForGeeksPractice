package BinaryTree;

public class MinimumNode {

	
	public int findMinimum(Node node,int min)
	{
		if(node.leftChild==null && node.rightChild==null && min<node.data)
			return min;
		else if(node.leftChild==null && node.rightChild==null && min>node.data)
			return node.data;
		
		if(min>node.data)
			min=node.data;
		
		int left=findMinimum(node.leftChild, min);
		int right=findMinimum(node.rightChild,min);
		
		if(left>right)
			return right;
		else
			return left;
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
		System.out.println(min.findMinimum(root,root.data));
	}

}
