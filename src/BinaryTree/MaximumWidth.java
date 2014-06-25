package BinaryTree;

public class MaximumWidth {

	public int getWidth(Node root)
	{
		int max=1;
		int hieght=getHieght(root);
		
		for(int i=1;i<hieght;i++)
		{
			int width=(findWidth(root,i));
			if(width>max)
				max=width;
		}
		return max;
		
	}
	
	public int findWidth(Node root,int level)
	{
		if(root==null)
			return 0;
		
		if(level==1) 
			return 1;
			
		else
		
		
		return findWidth(root.leftChild, level-1)+findWidth(root.rightChild, level-1);
		
		
	
	}
	
	public int getHieght(Node root)
	{
		if(root==null)
		
		return 0;
		
		int leftDepth=getHieght(root.leftChild);
		int rightDepth=getHieght(root.rightChild);
		
		if(leftDepth>rightDepth)
			return leftDepth+1;
		else
			return rightDepth+1;
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
		
		MaximumWidth max=new MaximumWidth();
		System.out.println("Maximum Width of the tree is "+max.getWidth(root));
	}

}
