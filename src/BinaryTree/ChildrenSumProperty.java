package BinaryTree;

public class ChildrenSumProperty {

	/**
	 * @param args
	 */
	
	public int checkIfSumProperty(Node root)
	{
		if(root==null)
			return 0;
		if(root.leftChild==null && root.rightChild==null)
			return root.data;
		int left=checkIfSumProperty(root.leftChild);
		int right=checkIfSumProperty(root.rightChild);
		if(left+right==root.data)
			return root.data;
		
		return -1;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(13);
		root.leftChild=new Node(7);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(6);
		root.rightChild.leftChild=new Node(6);
		
		ChildrenSumProperty child=new ChildrenSumProperty();
		System.out.println(child.checkIfSumProperty(root));
	}

}
