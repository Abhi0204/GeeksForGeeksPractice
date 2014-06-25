package BinaryTree;

public class Sumtree {

	public int findSumTree(Node root)
	{
		if(root==null)
			return 0;
		if(root.leftChild==null && root.rightChild==null)
			return root.data;

		if (root.data==findSumTree(root.leftChild)+findSumTree(root.rightChild))
			return root.data;
		else
		return 0;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.leftChild=new Node(8);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(5);
		root.rightChild=new Node(2);
		root.rightChild.leftChild=new Node(2);

		Sumtree sum=new Sumtree();
		if(sum.findSumTree(root)==0)
			System.out.println("Tree is not a sum tree");
		else
			System.out.println("Tree is a Sum Tree");
	}


}
