package BinarySearchTree;

import java.util.ArrayList;

public class ConstructBSTFromPreorder {	
	public static  Node ConstructTreefromPreOrder(int[] arr,int low,int high)
	{
	
		if(low>high)
			return null;
		
		
		Node root=new Node(arr[low]);
		if(low==high)
		return root;
		
		int index=0;
		for(int i=low;i<=high;i++)
		{
			if(arr[i]>arr[low])
			{
				index=i;
				break;
			}
				
		}
		
		root.rightChild=ConstructTreefromPreOrder(arr, index, high);
		
		root.leftChild=ConstructTreefromPreOrder(arr, low+1, index-1);
		
		return root;
	}
	
	public static void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.leftChild);
		System.out.print(root.data+" ");
		inorder(root.rightChild);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr=  {10,8,7,9,20,19,21};		
		Node temp=ConstructTreefromPreOrder(arr, 0, arr.length-1);
		inorder(temp);
	}

}
