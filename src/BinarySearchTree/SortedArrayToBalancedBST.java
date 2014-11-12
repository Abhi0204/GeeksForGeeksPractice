package BinarySearchTree;

public class SortedArrayToBalancedBST {

	public static Node CreateBalancedBST(int[] arr,int low,int high)
	{

		if(low>high)
			return null;
		int middle=(low+high)/2;
		Node root=new Node(arr[middle]);
		if(low==high)
			return root;
	
		root.leftChild=CreateBalancedBST(arr,low,middle-1);
		root.rightChild=CreateBalancedBST(arr,middle+1, high);

		return root;
	}

	public static void levelOrder(int n,Node root)
	{
		if(root==null)
			return;
		if(n==0)
			System.out.print(root.data);

		levelOrder(n-1, root.leftChild);
		levelOrder(n-1, root.rightChild);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={6,7,8,9,10};
		
Node root=CreateBalancedBST(arr,0, arr.length-1);
levelOrder(0, root);
System.out.println("\n");
levelOrder(1, root);
System.out.println("\n");
levelOrder(2, root);
System.out.println("\n");
levelOrder(3, root);
System.out.println("\n");
levelOrder(4, root);
	}

}
