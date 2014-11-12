package BinaryTree;

public class MirrorTree {

	public void preorder(Node node)
	{
		if(node==null)
			return;	  
		System.out.print(node.data+"->");
		preorder(node.leftChild);
		preorder(node.rightChild);
	}
	public void mirror(Node node)
	{
		if(node==null||(node.leftChild==null&& node.rightChild==null))
			return;
		Node temp=node.rightChild;
		node.rightChild=node.leftChild;
		node.leftChild=temp;

		mirror(node.leftChild);
		mirror(node.rightChild);
	}
	
	public void MirrorTreeConvert(Node root)
	{
	if(root==null)
	return;
	Node temp=root.leftChild;
	root.leftChild=root.rightChild;
	root.rightChild=temp;
	MirrorTreeConvert(root.leftChild);
	MirrorTreeConvert(root.rightChild);
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

		MirrorTree mr=new MirrorTree();
		mr.preorder(root);

		System.out.println("\n");
		mr.mirror(root);

		mr.preorder(root);
		System.out.println("\n");
		mr.MirrorTreeConvert(root);
		mr.preorder(root);

	}

}
