package BinaryTree;

public class CloneBinaryTree {

	/**
	 * @param args
	 */
	
	public static Node cloneBinaryTree(Node root)
	{
		if(root==null)
			return null;
		
		Node rootNew=new Node(root.data);
		rootNew.leftChild=cloneBinaryTree(root.leftChild);
		rootNew.rightChild=cloneBinaryTree(root.rightChild);
		
		return rootNew;
		
	}
	public static void PrintIndoer(Node root)
	{
		if(root==null)
			return;
		PrintIndoer(root.leftChild);
		System.out.print(root.data+" ");
		PrintIndoer(root.rightChild);
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
		
		Node rootTemp=cloneBinaryTree(root);
		PrintIndoer(rootTemp);
		
	}

}
