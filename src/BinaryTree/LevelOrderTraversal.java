package BinaryTree;

public class LevelOrderTraversal {

	public void printLeveloder(Node node)
	{
		for(int i=1;i<=getHieght(node);i++)
	       LevelOrderTraversal(node,i);
	}
	
	public void LevelOrderTraversal(Node root,int level)
	{
	   if(root==null)
		   return;
	   if(level==1)
		   System.out.print(root.data+"->");
	   else
	   {
		   LevelOrderTraversal(root.leftChild, level-1);
		   LevelOrderTraversal(root.rightChild, level-1);
	   }
	}
	public int getHieght(Node root)
	{
		if(root==null)
			return 0;
		int leftHieght=getHieght(root.leftChild);
		int rightChild=getHieght(root.rightChild);
		
		if(leftHieght>rightChild)
			return leftHieght+1;
		else
			return rightChild+1;
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
		
		LevelOrderTraversal levelorder=new LevelOrderTraversal();
		levelorder.printLeveloder(root);

	}

}
