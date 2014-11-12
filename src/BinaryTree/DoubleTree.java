package BinaryTree;

public class DoubleTree {
	public void getDoubleTree(Node root)
	{
		if(root==null)
			return;
		Node node=new Node(root.data);
		Node temp=root.leftChild;
		root.leftChild=node;
		node.leftChild=temp;

		getDoubleTree(root.leftChild.leftChild);
		getDoubleTree(root.rightChild);
	}
	public void doubleTree(Node node)
	{
		if(node==null)
			return;

		Node newNode=new Node(node.data);
		Node temp=node.leftChild;
		node.leftChild=newNode;
		newNode.leftChild=temp;

		doubleTree(temp);
		doubleTree(node.rightChild);
	}
	public void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.leftChild);
		System.out.print(root.data+" ");
		inorder(root.rightChild);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.leftChild=new Node(2);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(5);
		root.rightChild.leftChild=new Node(6);

		DoubleTree db=new DoubleTree();

		db.inorder(root);
		System.out.println("\n");
		db.getDoubleTree(root);
		db.inorder(root);
		
		System.out.println("\n");
		db.doubleTree(root);
		db.inorder(root);



	}

}
