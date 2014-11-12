package BinaryTree;

public class IdenticalTree {

	public void preorder(Node node)
	{
		if(node==null)
			return;	  
		System.out.print(node.data+"->");
		preorder(node.leftChild);
		preorder(node.rightChild);
	}
	
	
	public boolean checkIdentical(Node root,Node root1)
	{
		if(root==null&& root1==null)
			return true;
		else if(root==null&& root1!=null)
			return false;
		else if(root!=null&& root1==null)
			return false;
		
		if(root.data==root1.data)
			return checkIdentical(root.leftChild, root1.leftChild) && checkIdentical(root.rightChild, root1.rightChild);
		return false;
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
		
		
		Node root1=new Node(1);
		root1.leftChild=new Node(2);
		root1.leftChild.leftChild=new Node(3);
		root1.leftChild.rightChild=new Node(41);
		root1.rightChild=new Node(5);
		root1.rightChild.leftChild=new Node(6);
		root1.rightChild.leftChild.rightChild=new Node(9);
		root1.rightChild.leftChild.leftChild=new Node(7);
		root1.rightChild.rightChild=new Node(8);
		
		IdenticalTree identical=new IdenticalTree();
		identical.preorder(root);
		
		System.out.println("\n");
		
		
		System.out.println(identical.checkIdentical(root, root1));
		
	}

}
