package BinarySearchTree;


public class BSTTogreaterSUmtree {
	
	public static Node root=null;
	public Node insertBSt(Node root,Node node)
	{
		if(root==null)
		{
			node.leftChild=null;
			node.rightChild=null;
			return node;
		}

		if(node.data>root.data)
			root.rightChild=insertBSt(root.rightChild,node);
		else if(node.data<root.data)
			root.leftChild=insertBSt(root.leftChild,node);

		return root;

	}
	public void inorder(Node node)
	{
		if(node==null)
			return;
		inorder(node.leftChild);
		System.out.print(node.data+" ");
		inorder(node.rightChild);
	}	
	public int AddSumTree(Node root,int sum)
	{
		if(root==null)
		return sum;
		
		sum=AddSumTree(root.rightChild, sum);
		sum=sum+root.data;
		root.data=sum;
		return AddSumTree(root.leftChild, sum);
		
	}
	

	public int ChangeSumTree(Node root,int sum)
	{
		if(root==null)
			return sum;
		
		sum=ChangeSumTree(root.rightChild, sum);
		int temp=root.data;
		root.data=sum;
		sum=sum+temp;
	   return ChangeSumTree(root.leftChild, sum);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node first=new Node(11);
		Node second=new Node(29);
		Node third=new Node(15);
		Node fourth=new Node(40);
		Node fifth=new Node(35);
		Node sixth=new Node(2);
		Node seventh=new Node(1);
		Node eight=new Node(7);
		


		root=first;
		BSTTogreaterSUmtree insert=new BSTTogreaterSUmtree();
		insert.insertBSt(root,second);

		insert.insertBSt(root,third);
		insert.insertBSt(root,fourth);
		insert.insertBSt(root,fifth);
		insert.insertBSt(root,sixth);
		insert.insertBSt(root,seventh);
		insert.insertBSt(root,eight);
		
		
		insert.inorder(root);
		System.out.println("\n");
		
		insert.AddSumTree(root, 0);
		
		insert.inorder(root);
		
	}

}
