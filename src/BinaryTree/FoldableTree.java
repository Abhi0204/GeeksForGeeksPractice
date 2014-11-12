package BinaryTree;

public class FoldableTree {
	
	public static Node root=null;
	public boolean FoldableTreeCal(Node root)
	{
		if(root==null)
			return true;
		return isFoldable(root.leftChild,root.rightChild);
	}
	
	public boolean isFoldable(Node root,Node root1)
	{
		if(root==null && root1==null)
			return true;
		if(root==null||root1==null)
			return false;
		return (isFoldable(root.leftChild, root1.rightChild) && isFoldable(root.rightChild, root1.leftChild));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		root=new Node(1);
		root.leftChild=new Node(2);
		root.rightChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild.leftChild=new Node(5);
		FoldableTree fold=new FoldableTree();
		System.out.println(fold.FoldableTreeCal(root));
	}

}
