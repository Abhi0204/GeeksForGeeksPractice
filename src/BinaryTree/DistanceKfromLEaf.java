package BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;

public class DistanceKfromLEaf {

	HashSet<Integer> myset=new HashSet<Integer>();
	public void printNodesKdistanceFormLEaf(Node root,ArrayList<Integer> arr,int k)
	{
		if(root==null)
			return;
		
		if(root.leftChild==null && root.rightChild==null)
		{
			printArray(arr,k);
			return;
		}

		arr.add(root.data);
		printNodesKdistanceFormLEaf(root.leftChild,arr,k);
		printNodesKdistanceFormLEaf(root.rightChild,arr,k);
		
		arr.remove(arr.size()-1);
	}

	public void printArray(ArrayList<Integer> arr,int k)
	{

	
		if(!myset.contains(arr.get(arr.size()-k)))
		System.out.print(arr.get(arr.size()-k)+" ");
		myset.add(arr.get(arr.size()-k));


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
		root.rightChild.rightChild.rightChild=new Node(18);
		DistanceKfromLEaf dis=new DistanceKfromLEaf();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		dis.printNodesKdistanceFormLEaf(root,arr,2);
	}
}