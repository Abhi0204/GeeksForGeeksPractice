package BinaryTree;

public class PrintNodesatKdistance {

	public void printNodes(Node root,int level)
	{
		if(root==null)
			return;
		if(level==2)
			System.out.print(root.data+" ");
		printNodes(root.leftChild, level+1);
		printNodes(root.rightChild, level+1);
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
		
		PrintNodesatKdistance print=new PrintNodesatKdistance();
		print.printNodes(root,0);
	}

}
