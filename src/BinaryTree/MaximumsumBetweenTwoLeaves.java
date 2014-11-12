package BinaryTree;

public class MaximumsumBetweenTwoLeaves {
	public static int getMaximumSumbetweenTwoLeaves(Node root,int sum,int[] arr,int index)
	{

		if(root==null)
			return 0;

		int leftSum=getMaximumSumbetweenTwoLeaves(root.leftChild,sum,arr,index);
		int rightSum=getMaximumSumbetweenTwoLeaves(root.rightChild,sum,arr,index);

		int resultSum=leftSum+rightSum+root.data;
		if(resultSum>sum)
		{
			sum=resultSum;
			arr[index]=sum;
		}

		return Math.max(leftSum,rightSum)+root.data;
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
		int[] arr =new int[1];
		getMaximumSumbetweenTwoLeaves(root,0, arr,0);
		for(int i:arr)
			System.out.println(i);
		
	}

}
