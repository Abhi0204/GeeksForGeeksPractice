package BinaryTree;

import java.util.Stack;

public class ConstructTreeFromINOrederPreoder {

	/**
	 * @param args
	 */
	
	static int i=0;

	public Node constructTree(int [] pre,int[] in,int low,int high)
	{
	
		if(low>high)
			return null;
		
		Node node=new Node(pre[i++]);
		
		if(low==high)
			return node;
		
		int index=search(node.data,in);
		
		node.leftChild=constructTree(pre,in,low,index-1);
		node.rightChild=constructTree(pre,in,index+1, high);
		
		return node;
		
		
	}
	
	public int search(int data,int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
			return i;
		}
		return -1;
	}
	
	public void inorder(Node root)
	{
		Node current=root;
		Stack<Node> mySatck=new Stack<Node>();
		
		while(mySatck.isEmpty()==false||current!=null)
		{
			if(current!=null)
			{
				mySatck.push(current);
				current=current.leftChild;
				
			}
			else{
				Node temp=mySatck.pop();
				System.out.println(temp.data);
				current=temp.rightChild;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int[] preorder={1,2,3,4,5,6,7,9,8};
		int[] inorder={3,2,4,1,7,6,9,5,8};
		
		ConstructTreeFromINOrederPreoder conmstruct=new ConstructTreeFromINOrederPreoder();
		Node root=conmstruct.constructTree(preorder, inorder, 0, inorder.length-1);
		conmstruct.inorder(root);
	}

}
