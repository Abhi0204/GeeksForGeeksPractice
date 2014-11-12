package BinaryTree;

public class checkCousins {

	public int returnLevel(Node root,Node a,int level)
	{
		if(root==null)
			return -1;
		if(root.data==a.data)
			return level;
		int count=returnLevel(root.leftChild, a,level+1);
		if(count==-1)
			return returnLevel(root.rightChild, a, level+1);
		return count;
	}
	//Check if  two nodes are cousins
	
	public boolean checkCousinsNodes(Node root,Node a,Node b)
	{
		if(root==null)
			return false;
		int level_first=returnLevel(root, a, 0);
		int level_second=returnLevel(root, b, 0);
		
		if(level_first!=level_second)
			return false;
		else
		{
			if(checkDifferentParent(root, a, b))
				return true;
			
			return false;
		}
	}
	
	public boolean checkDifferentParent(Node root,Node a,Node b)
	{
		if(root==null)
			return true;
		if((root.leftChild==a && root.rightChild==b)||(root.leftChild==b && root.rightChild==a))
			return false;
		if((root.leftChild==a && root.rightChild!=b)||(root.leftChild!=b && root.rightChild==a))
			return true;
		
		return checkDifferentParent(root.leftChild, a, b)&&checkDifferentParent(root.rightChild, a, b);
		
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
		
		checkCousins check=new checkCousins();
		System.out.println(check.checkCousinsNodes(root,root.leftChild.leftChild,root.rightChild.leftChild));
	}

}
