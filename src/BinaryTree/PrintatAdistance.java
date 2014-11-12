package BinaryTree;

public class PrintatAdistance {

	/**
	 * @param args
	 */
	
	public static void findaNodeDown(Node root,int n)
	{
		if(root==null)
			return;
		if(n==0)
			System.out.println(root.data);
		findaNodeDown(root.leftChild, n-1);
		findaNodeDown(root.rightChild, n-1);
			
	}
	
	
	public static int printNodesAtaDistancek(Node root,Node node,int n)
	{
		 if(root==null)
			 return -1;
		 
		 if(root==node)
		 { findaNodeDown(root, n);
		 return 0;
		 }
		 else
		 {
			int leftIndex=printNodesAtaDistancek(root.leftChild, node, n);
			if(leftIndex!=-1)
			{
			    if(leftIndex+1==n)
			    	System.out.println(root.data);
			    else
			    	findaNodeDown(root.rightChild,n-leftIndex-2);
				
				return leftIndex+1;
			}
			
			int rightIndex=printNodesAtaDistancek(root.rightChild, node,n);
			if(rightIndex!=-1)
			{
				if(rightIndex+1==n)
					System.out.println(root.data);
				else
			    	findaNodeDown(root.leftChild,n-rightIndex-2);

				return rightIndex+1;
			}
		 }
		 
		 return -1;
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
		
		
		printNodesAtaDistancek(root, root.rightChild, 3);
	}
	
	

}
