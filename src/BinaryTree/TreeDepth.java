package BinaryTree;

public class TreeDepth {

	public int getTreeDepth(Node node)
	{
		if(node==null)
			return 0;
		else
		{
			int leftDepth=getTreeDepth(node.leftChild);
			int rightDepth=getTreeDepth(node.rightChild);
			
			if(leftDepth>rightDepth)
				return leftDepth+1;
			else
				return rightDepth+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root=new Node(1);
		root.leftChild=new Node(2);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(5);
		root.rightChild.leftChild=new Node(6);
		
		TreeDepth firstTree=new TreeDepth();
		System.out.println(firstTree.getTreeDepth(root));
	}

}
