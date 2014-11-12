package BinaryTree;

public class SubtreeInaBinaryTree {
	public boolean checkSubtree(Node root,Node root1)
	{
		if(root==null)
			return false;

		if(root.data==root1.data)
				return IdenticalTrees(root,root1);
	

		boolean flag=checkSubtree(root.leftChild,root1);
		if(!flag)
			return checkSubtree(root.rightChild,root1);

		return true;
	}

	public boolean IdenticalTrees(Node root,Node root1)
	{

		if(root==null && root1==null)
			return true;
		if(root==null||root1==null)
			return false;
		if(root.data==root1.data)
		return IdenticalTrees(root.leftChild,root1.leftChild)&& IdenticalTrees(root.rightChild,root1.rightChild);
		
		return false;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(26);
		root.leftChild=new Node(10);
		root.leftChild.leftChild=new Node(4);
		root.leftChild.rightChild=new Node(8);
		root.rightChild=new Node(3);
		root.rightChild.leftChild=new Node(2);
		root.rightChild.rightChild=new Node(5);

		Node root1=new Node(10);
		root1.leftChild=new Node(4);
		root1.rightChild=new Node(8);
		
		SubtreeInaBinaryTree subtree=new SubtreeInaBinaryTree();
        System.out.println(subtree.checkSubtree(root, root1));
	}

}
