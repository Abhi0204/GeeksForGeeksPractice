package BinarySearchTree;

public class ConstructBSTfromPostOrder {

	/**
	 * @param args
	 */
	
	public static Node root=null;
	
	public static Node createBSfromPostOrder(int[] arr,int low,int high)
	{
	     if(low>high)
	    	 return null;
	     Node root=new Node(arr[high]);
	     if(low==high)
	    	 return root;
	     int index=0;
	     for(int i=high;i>=low;i--)
	     {
	    	 if(arr[i]<arr[high])
	    	 {    index=i;
	    		 break;
	    	 }
	     }
	     
	     root.leftChild=createBSfromPostOrder(arr, low, index);
	     root.rightChild=createBSfromPostOrder(arr,index+1,high-1);
	     
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

		int[] arr={28,34,30,42,60,70,40};
		Node root=createBSfromPostOrder(arr, 0, arr.length-1);
		inorder(root);
		
	}

}
