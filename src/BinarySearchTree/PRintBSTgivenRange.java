package BinarySearchTree;

public class PRintBSTgivenRange {
	public static Node root=null;
	public static int count=0;
	
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
	
	
	public void getRange(Node root,int a,int b)
	{
		if(root==null)
			return;
		
		if(root.data>=a && root.data<=b)
			System.out.println(root.data);
		if(root.data>a)
			getRange(root.leftChild, a, b);
		if(root.data<b)
			getRange(root.rightChild, a, b);
			
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
		PRintBSTgivenRange insert=new PRintBSTgivenRange();
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
		
		
		insert.getRange(root,95,120);
	}

}
