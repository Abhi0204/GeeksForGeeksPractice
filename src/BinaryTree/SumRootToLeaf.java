package BinaryTree;

public class SumRootToLeaf {

	
	public boolean checkSum(Node node,int number,int sum )
	{
		if(node==null)
			return false;
	  
		sum=sum+node.data;
		
		if(sum==number)
			return true; 
		
	
		boolean flag=checkSum(node.leftChild, number, sum);
		if(flag==false)
			return checkSum(node.rightChild, number, sum);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(1);
		root.leftChild = new Node(2);
		root.leftChild.leftChild = new Node(3);
		root.leftChild.rightChild = new Node(4);
		root.rightChild = new Node(5);
		root.rightChild.leftChild = new Node(6);
		root.rightChild.leftChild.rightChild = new Node(9);
		root.rightChild.leftChild.leftChild = new Node(7);
		root.rightChild.rightChild = new Node(8);
		
		SumRootToLeaf check=new SumRootToLeaf();
		System.out.println(check.checkSum(root,14,0));
	}

}
