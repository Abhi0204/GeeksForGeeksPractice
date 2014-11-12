package BinaryTree;

public class LargestBSTinBT {

	/**
	 * @param args
	 */
	public static int getSizeofLargestBST(Node root,int[] count,int[] max)
	{
		if(root==null)
			return 0;
		if(root.leftChild==null && root.rightChild==null)
			return root.data;
		
		int left=getSizeofLargestBST(root.leftChild,count,max);
		int right=getSizeofLargestBST(root.rightChild,count,max);
	    if(root.data>left && root.data<right)
	    {
	    	count[0]=count[0]+2;
	    	if(max[0]<count[0])
	    		max[0]=count[0];
	    }
	    
	    return root.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.leftChild=new Node(2);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(50);
		root.rightChild.leftChild=new Node(46);
		root.rightChild.leftChild.rightChild=new Node(49);
		root.rightChild.leftChild.leftChild=new Node(37);
		root.rightChild.rightChild=new Node(58);
		
		int[] count=new int[1];
		count[0]=0;
		int[] max=new int[1];
		max[0]=0;
		System.out.println(getSizeofLargestBST(root,count,max));
	}

}
