package BinaryTree;

public class CreateTreeFromPreorder {

	public Node CreatTree(int[] index,int [] arr,char[] charr)
	{
		if(index[0]==arr.length)
			return null;
		Node node=new Node(arr[index[0]]);
		if(charr[index[0]]!='L')
		{	
			index[0]=index[0]+1;

			node.leftChild=CreatTree(index, arr, charr);
			
			index[0]=index[0]+1;

			node.rightChild=CreatTree(index, arr, charr);
		}
		
		return node;
		
		
	}
	
	public void inorder(Node root)
	{
		if (root==null)
			return;
		inorder(root.leftChild);
		System.out.print(root.data+" ");
		inorder(root.rightChild);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={10,23,1,2,33,14};
		char[] charr={'N','N','L','L','N','L'};
		int[] index=new int[1];
		index[0]=0;
		CreateTreeFromPreorder creat=new CreateTreeFromPreorder();
		Node temp=creat.CreatTree(index, arr, charr);
		creat.inorder(temp);
	}

}
