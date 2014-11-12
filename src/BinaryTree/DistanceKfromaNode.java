package BinaryTree;

public class DistanceKfromaNode {

	public static void findanodedown(Node root,int k)
	{
	if(root==null)
	return;

	if(k==0)
	{
	System.out.print(root.data+" ");
	}

	findanodedown(root.leftChild,k-1);
	findanodedown(root.rightChild,k-1);
	}
	
	

	public static int findAtaDistancefromNode(Node root,Node target,int k)
	{
		if(root==null)
			return -1;
		
		if(root==target)
		{
		findanodedown(root, k);
		return 0;
		}
		
		int left=findAtaDistancefromNode(root.leftChild, target, k);
		if(left!=-1)
		{
			if(left+1==k)
				System.out.println(root.data);
			else
				findanodedown(root.rightChild,k-left-2);
			
			return left+1;
		}
		
		int right=findAtaDistancefromNode(root.rightChild, target, k);
		if(right!=-1)
		{
			if(right+1==k)
				System.out.println(root.data);
			else
			findanodedown(root.leftChild,k-right-2);
			return right+1;
				
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
		findAtaDistancefromNode(root,root.rightChild,3);
	}

}
