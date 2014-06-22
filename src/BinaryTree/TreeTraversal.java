package BinaryTree;

public class TreeTraversal {

	static int count=0;
	boolean flag=false;
	public void inorderTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorderTraversal(root.leftChild);
		System.out.print(root.data+"->");
		inorderTraversal(root.rightChild);

	}
	public void preorderTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+"->");
		preorderTraversal(root.leftChild);
	
		preorderTraversal(root.rightChild);

	}
	
	public void postorderTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		postorderTraversal(root.leftChild);
	
		postorderTraversal(root.rightChild);
		System.out.print(root.data+"->");
		count++;

	}
	
	int size(Node node) 
	{  
	  if (node==null)
		  return 0;
	  else  
	    return(size(node.leftChild)+1+size(node.rightChild));
	  
	}
	
	public int checkiDentical(Node node,Node node1)
	{
		
		if(node==null && node1==null)
			return 0;
		
			if(node.data==node1.data)
			{
				int left=checkiDentical(node.leftChild, node1.leftChild);
			if(left==0)
				return checkiDentical(node.rightChild, node1.rightChild);
			
			
			}
		
				return -1;
				
			
		/*
		if (flag==true)
		return -1;
		
		else 
			return 0;*/
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node root=new Node(1);
		root.leftChild=new Node(2);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(5);
		root.rightChild.leftChild=new Node(6);
		
		TreeTraversal firstTree=new TreeTraversal();
		firstTree.inorderTraversal(root);
		System.out.println("\n");
		firstTree.preorderTraversal(root);
		System.out.println("\n");
		firstTree.postorderTraversal(root);
		System.out.println("\n");
		//System.out.println(count);
		
		TreeTraversal secondTree=new TreeTraversal();
		Node rootnew=new Node(1);
		rootnew.leftChild=new Node(2);
		rootnew.leftChild.leftChild=new Node(31);
		rootnew.leftChild.rightChild=new Node(4);
		rootnew.rightChild=new Node(5);
		rootnew.rightChild.leftChild=new Node(6);
		System.out.println(secondTree.size(rootnew));
		
		int no=secondTree.checkiDentical(root, rootnew);
		secondTree.inorderTraversal(rootnew);
		System.out.println("\n");
		if(no==-1)
			System.out.println("Trees not identical");
		else
			System.out.println("Trees are identical");
	}

}
