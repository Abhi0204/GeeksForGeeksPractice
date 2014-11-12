package BinaryTree;

public class DepthOfDeepestOddLevelLEafNode {

	
	public int getDepth(Node root,int level,int maxLevel,boolean flag)
	{
		if(root==null)
			return maxLevel;
		
		if(flag==true && level%2!=0)
		{
			if(root.leftChild==null && root.rightChild==null)
			{
				if(level>maxLevel)
					maxLevel=level;	
				return maxLevel;
			}
		}
	   int leftLevel= getDepth(root.leftChild, level+1, maxLevel, true);
       int rightLevel=getDepth(root.rightChild, level+1,leftLevel, false);
		 
		 return Math.max(leftLevel,rightLevel);
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
		root.rightChild.leftChild.leftChild.leftChild = new Node(71);
		root.rightChild.rightChild.leftChild = new Node(81);
		root.rightChild.rightChild.leftChild.leftChild = new Node(19);
		
		
		DepthOfDeepestOddLevelLEafNode deep=new DepthOfDeepestOddLevelLEafNode();
		System.out.println(deep.getDepth(root,1,0,false));
	}

}
