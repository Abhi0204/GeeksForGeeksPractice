package BinaryTree;

import java.util.HashSet;

public class LCA {

	public int findLCABinaryTree(Node root,int n1,int n2)
	{
		int [] arr=new int[10];
		int [] arr0=new int[10];
		int[] arr1=findPAthfromRoot(root,n1, arr,0);
		int [] arr2=findPAthfromRoot(root, n2, arr0,0);
		int i=0;
		int no=Math.min(arr1.length,arr2.length);

		for(i=0;i<no;i++)
		{
			if(arr1[i]!=arr2[i])
				return arr[i-1];
		}
		return arr2[i-1];
	}

	public int[] findPAthfromRoot(Node root,int data,int[] arr,int index)
	{
		if(root==null)
			return null;
		arr[index]=root.data;
		if(root.data==data)
			return arr;
		int[] myarr=findPAthfromRoot(root.leftChild, data, arr, index+1);
		if(myarr==null)
			return findPAthfromRoot(root.rightChild, data, arr, index+1);

		return myarr;
	}


	public Node LCABinaryTree(Node node,int a,int b)
	{
		if(node==null)
			return null;

		if(node.data==a||node.data==b)
			return node;

		Node left=LCABinaryTree(node.leftChild,a,b);
		Node right=LCABinaryTree(node.rightChild,a,b);

		if(left!=null && right!=null)
			return node;

		else
		{
			if(left!=null)
				return left;
			else
				return right;
		}
	}

	public Node LCABinaryTree(Node node,Node a,Node b)
	{

		HashSet<Node> hash=new HashSet<Node>();
		int count=0;
		while(a!=null||b!=null)
		{
		
			if(a!=null)
			{
				if(hash.contains(a))
					return a;
				else
					hash.add(a);
				a=a.parent;
				count++;
			}

			if(b!=null)
			{
				if(hash.contains(b))
				{System.out.println(count-1);
					return b;
				}
				else
					hash.add(b);
				b=b.parent;
				count++;
				
			}
			
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(26);
		root.parent=null;
		root.leftChild=new Node(10);
		root.leftChild.parent=root;
		root.leftChild.leftChild=new Node(4);
		root.leftChild.leftChild.parent=root.leftChild;
		root.leftChild.rightChild=new Node(8);
		root.leftChild.rightChild.parent=root.leftChild;
		root.rightChild=new Node(3);
		root.rightChild.parent=root;
		root.rightChild.leftChild=new Node(2);
		root.rightChild.leftChild.parent=root.rightChild;
		root.rightChild.rightChild=new Node(5);
		root.rightChild.rightChild.parent=root.rightChild;

		LCA lca=new LCA();	    
		System.out.println(lca.findLCABinaryTree(root,4, 5));	

		System.out.println(lca.LCABinaryTree(root,4,8).data);
		
		System.out.println(lca.LCABinaryTree(root, root.leftChild.leftChild,root.rightChild.rightChild).data);
		
	}
}
