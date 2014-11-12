package BinarySearchTree;

public class CreateABSTfromArrayComplete {

	/**
	 * @param args
	 */
	static int i=0;
	public Node createBST(Node[] arr)
	{
		if(arr.length==0)
			return null;
		if(arr.length==1)
			return arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			Node parent=arr[i];
			if((2*i)+1<arr.length)
			{
				parent.leftChild=arr[(2*i)+1];
			}
			if((2*i)+2<arr.length)
			{
				parent.rightChild=arr[(2*i)+2];
			}
		}
		return arr[0];
	}
	
	public Node createBST(int[] arr,int low,int high)
	{
		if(low>high)
			return null;
		
		Node root=new Node(arr[low]);
		
		root.leftChild=createBST(arr,2*low+1,high);
		root.rightChild=createBST(arr,2*low+2,high);
		return root;
	}
	
	public void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.leftChild);
		System.out.print(root.data+"->");
		inorder(root.rightChild);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={4,2,5,1,3};
		Node[] arrNode=new Node[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
			arrNode[i]=new Node(arr[i]);
		}
		
		CreateABSTfromArrayComplete create=new CreateABSTfromArrayComplete();
		Node temp=create.createBST(arr,0,arr.length-1);
		//Node temp=create.createBST(arrNode);
	    create.inorder(temp);	
	}

}
