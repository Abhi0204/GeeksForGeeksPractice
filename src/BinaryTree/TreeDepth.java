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
	
	public int findhieghtOfaTree(Node root)
	{
	if(root==null)
	return 0;

	return 1 +Math.max(findhieghtOfaTree(root.leftChild),findhieghtOfaTree(root.rightChild));


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
		
		TreeDepth firstTree=new TreeDepth();
		System.out.println(firstTree.findhieghtOfaTree(root));
		System.out.println(firstTree.getTreeDepth(root));
	}

}
