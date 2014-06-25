package BinaryTree;

public class countLeafNodes {


	public int countLeaf(Node root)
	{
		if(root.leftChild==null && root.rightChild==null)
		return 1;
		return countLeaf(root.leftChild)+countLeaf(root.rightChild);
	}
	
	public int recurseCountLeaf(Node root)
	{
		if(root==null)
			return 0;
		else if(root.leftChild==null && root.rightChild==null)
			return 1;
		return (recurseCountLeaf(root.leftChild)+recurseCountLeaf(root.rightChild));
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
		
		countLeafNodes countleaf=new countLeafNodes();
		countleaf.countLeaf(root);

		
		System.out.println("Count is "+countleaf.recurseCountLeaf(root));
	}

}
