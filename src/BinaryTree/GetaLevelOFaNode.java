package BinaryTree;

public class GetaLevelOFaNode {

	public int getNodesatKdistance(Node root,int number,int k)
	{
		if(root==null)
			return 0;

		if(root.data==number)
			System.out.println(k);

	    int level=getNodesatKdistance(root.leftChild,number,k+1);
	    
	    if(level==0)
		return getNodesatKdistance(root.rightChild,number,k+1);
	    	return level;
	    

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

		countLeafNodes countleaf=new countLeafNodes();
		countleaf.countLeaf(root);
		
		GetaLevelOFaNode get=new GetaLevelOFaNode();
		get.getNodesatKdistance(root, 9, 0);

	}

}
