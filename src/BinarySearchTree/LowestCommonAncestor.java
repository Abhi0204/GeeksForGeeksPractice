package BinarySearchTree;

public class LowestCommonAncestor {
	public static Node root=null;
	public Node insertBSt(Node root,Node node)
	{
		if(root==null)
			return node;
		if(node.data<root.data)
			root.leftChild=insertBSt(root.leftChild, node);
		else
			root.rightChild=insertBSt(root.rightChild, node);
		
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
	
	public Node findLowestCommonAncestor(Node node,Node a,Node b)
	{
		if(node==null)
			return null;
		while(node!=null)
		{
			if(a.data<node.data && b.data<node.data)
				node=node.leftChild;
			else if(a.data>node.data && b.data>node.data)
				node=node.rightChild;
			else
				break;
		}
		return node;
	}
	
	
	public Node LCA(Node root,Node a,Node b)
	{
		if(root==null)
			return null;
		if(root.data>a.data && root.data>b.data)
			LCA(root.leftChild,a,b);
		if(root.data<a.data && root.data<b.data)
			LCA(root.rightChild,a,b);
		
		return root;
	}
	
	public Node RecursiveFindLLCS(Node node,Node a,Node b)
	{
		if(node==null)
			return null;
		
	      if(a.data<node.data && b.data<node.data)
	    	 return RecursiveFindLLCS(node.leftChild,a ,b);
	      else if(a.data>node.data && b.data>node.data)
	     	 return RecursiveFindLLCS(node.rightChild,a ,b);
	      
	    	  return node;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=new Node(100);
		Node second=new Node(120);
		Node third=new Node(140);
		Node fourth=new Node(70);
		Node fifth=new Node(60);
		Node sixth=new Node(80);
		Node seventh=new Node(110);
		Node eight=new Node(50);
		Node ninth=new Node(40);
		Node tenth=new Node(55);
		Node eleven=new Node(58);
		Node twel=new Node(54);
		
		root=first;
		LowestCommonAncestor insert=new LowestCommonAncestor();
		insert.insertBSt(root,second);

		insert.insertBSt(root,third);
		insert.insertBSt(root,fourth);
		insert.insertBSt(root,fifth);
		insert.insertBSt(root,sixth);
		insert.insertBSt(root,seventh);
		insert.insertBSt(root,eight);
		insert.insertBSt(root,ninth);
		insert.insertBSt(root,tenth);
		insert.insertBSt(root,eleven);
		insert.insertBSt(root,twel);
		
		System.out.println(insert.findLowestCommonAncestor(root, eleven, third).data);
		
		System.out.println("\n");
		System.out.println(insert.RecursiveFindLLCS(root,eleven, third).data);
		System.out.println("\n"+"");
		Node temp=insert.LCA(root, eleven,third);
		System.out.println(temp.data);

	}

}
