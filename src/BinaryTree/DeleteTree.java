package BinaryTree;

public class DeleteTree {

	static Node root=null;
	public void postOrderTraversal(Node root)
	{
		if(root==null)
			return;
		postOrderTraversal(root.leftChild);
		postOrderTraversal(root.rightChild);
		System.out.print(root.data+" ");
	}
	
	public void deleteTree(Node root)
	{
		if(root==null)	
			return;
		deleteTree(root.leftChild);
		deleteTree(root.rightChild);
		System.out.println("deleting node "+root.data);
		root=null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		root=new Node(1);
		root.leftChild=new Node(2);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(5);
		root.rightChild.leftChild=new Node(6);
		
		DeleteTree del=new DeleteTree();
		del.postOrderTraversal(root);
		System.out.println("\n");
		
		del.deleteTree(root);
		
		System.out.println("\n");
		System.out.println("Tree Deleted");
		del.postOrderTraversal(root);
	}

}
