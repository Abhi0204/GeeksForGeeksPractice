package BinaryTree;

import java.util.Stack;

public class CreateAtreeFromInorderAndPostOrder {

	/**
	 * @param args
	 */
	static int i;
	public CreateAtreeFromInorderAndPostOrder(int[] arr)
	{
		i=arr.length-1;
	}
	
	public Node ConstructTree(int[] post,int[] in,int low,int high)
	{
		if(low>high)
			return null;
		
		Node node=new Node(post[i]);
		i--;
		if(low==high)
			return node;
		int index=search(node.data,in);

		node.rightChild=ConstructTree(post, in,index+1, high);
		node.leftChild=ConstructTree(post, in, low, index-1);
		
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
	
	public void postOrder(Node root)
	{
		Stack<Node> myStack=new Stack<Node>();
		Node current=root;
		myStack.push(current);
		Node temp=null;
		while(myStack.isEmpty()==false)
			{
			Node jo=myStack.peek();
			if((jo.leftChild==null && jo.rightChild==null) || (jo.leftChild==temp||jo.rightChild==temp))
			{
				temp=myStack.pop();
				System.out.print(temp.data+" ");	
			}
			else
			{
				if(jo.rightChild!=null)
					myStack.push(jo.rightChild);
				if(jo.leftChild!=null)
					myStack.push(jo.leftChild);	
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] postorder={3,4,2,7,9,6,8,5,1};
		int[] inorder={3,2,4,1,7,6,9,5,8};
		CreateAtreeFromInorderAndPostOrder create=new CreateAtreeFromInorderAndPostOrder(inorder);
		Node root=create.ConstructTree(postorder, inorder, 0, inorder.length-1);
		create.postOrder(root);
	}

}
