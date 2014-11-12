package BinaryTree;

public class Sumtree {

	public int findSumTree(Node root)
	{
		if(root==null)
			return 0;
		if(root.leftChild==null && root.rightChild==null)
			return root.data;

		if (root.data==findSumTree(root.leftChild)+findSumTree(root.rightChild))
			return root.data;
		else
			return 0;

	}

	public int checkChildrenSumProperty(Node root)
	{

		if(root==null)
			return 0;
		
		if(root.leftChild==null && root.rightChild==null)
			return root.data;
		int data=checkChildrenSumProperty(root.leftChild)+checkChildrenSumProperty(root.rightChild);
		if(data==root.data)
			return root.data;

		return 0;
	}
	
	public int makeTreeSumTree(Node node,int data)
	{

	if(node==null)
	return 0;
	if(node.leftChild==null && node.rightChild==null)
	{
		node.data=node.data+data;
	return node.data;
	}

	int mydata=makeTreeSumTree(node.leftChild,data)+makeTreeSumTree(node.rightChild,data);
	
		node.data=mydata;
	    return node.data;
	   
	}
	
	public void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.leftChild);
		inorder(root.rightChild);
		System.out.print(root.data+"->");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(50);
		root.leftChild=new Node(7);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(5);
		root.rightChild=new Node(2);
		root.rightChild.leftChild=new Node(30);
		root.rightChild.rightChild=new Node(1);


		Sumtree sum=new Sumtree();
		if(sum.checkChildrenSumProperty(root)==0)
			System.out.println("Tree is not a sum tree");
		else
			System.out.println("Tree is a Sum Tree");
		
		System.out.println(sum.makeTreeSumTree(root, root.data));
		
		if(sum.checkChildrenSumProperty(root)==0)
			System.out.println("Tree is not a sum tree");
		else
			System.out.println("Tree is a Sum Tree");
		
		sum.inorder(root);
		
		
		
	}


}
