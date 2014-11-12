package BinaryTree;

public class SumRootToLeaf {

	public boolean SumRooToLeaf(Node root,int total)
	{
		if(root==null)
			return false;
	if(root.leftChild==null && root.rightChild==null)
	{
		if(total-root.data==0)
			return true;
		return false;
	}
		
	return	SumRooToLeaf(root.leftChild, total-root.data)
		|| SumRooToLeaf(root.rightChild, total-root.data);
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

		SumRootToLeaf check=new SumRootToLeaf();
		
		System.out.println(check.SumRooToLeaf(root,14));
	}

}
