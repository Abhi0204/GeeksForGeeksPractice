package BinaryTree;

public class ArrayToBinaryTree {

	public Node convertArrayToBinaryTree(Node[] arr)
	{
	    Node root=null;
		for(int i=0;i<arr.length;i++)
		{
			
			if(root==null)
				root=arr[i];
			
			if((2*i)+1<arr.length)
			{	Node leftChild=arr[(2*i)+1];  
			    arr[i].leftChild=leftChild;
			}
			
			if((2*i)+2<arr.length)
		       {
				Node rightChild=arr[(2*i)+2];
				arr[i].rightChild=rightChild;
		       }
		
		}
		return root;
	}
	
	
	public void inorder(Node root)
	{
		if (root==null)
		return;
		inorder(root.leftChild);
		System.out.print(root.data+"->");
		inorder(root.rightChild);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     int[] arr={10,12,15,25,30,36};
     Node[] myarr=new Node[arr.length];
     for(int i=0;i<arr.length;i++)
     {
    	 myarr[i]=new Node(arr[i]);
     }
		
     Node root=new ArrayToBinaryTree().convertArrayToBinaryTree(myarr);
     new ArrayToBinaryTree().inorder(root);
	}

}
