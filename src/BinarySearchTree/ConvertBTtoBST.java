package BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertBTtoBST {

	public void convertBTtoBST(Node root)
	{
		ArrayList<Integer> myarr=new ArrayList<Integer>();
		getInorder(root, myarr);
		Collections.sort(myarr);
		int[] index=new int[1];

		Convert(root, myarr, index);

	}
	public void getInorder(Node root,ArrayList<Integer> ar)
	{
		if(root==null)
			return;
		getInorder(root.leftChild, ar);
		ar.add(root.data);
		getInorder(root.rightChild, ar);
	}

	public void Inorder(Node root)
	{
		if(root==null)
			return;
		Inorder(root.leftChild);
		System.out.print(root.data+" ");
		Inorder(root.rightChild);
	}

	public void Convert(Node root,ArrayList<Integer> myarr,int[] index)
	{
		if(root==null)
			return;
		Convert(root.leftChild, myarr,index);
		root.data=myarr.get(index[0]);
		index[0]=index[0]+1;
		Convert(root.rightChild,myarr,index);
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
		ArrayList<Integer> myarr=new ArrayList<Integer>();
		ConvertBTtoBST con=new ConvertBTtoBST();
		con.getInorder(root, myarr);
		for(int i:myarr)
			System.out.print(i+" ");
		System.out.println("\n");
		myarr.clear();
		con.convertBTtoBST(root);
		con.Inorder(root);

	}

}
