package BinarySearchTree;

public class Deletion {
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
	public Node findMin(Node root)
	{
		if(root==null)
			return null;
		
		while(root.leftChild!=null)
			root=root.leftChild;
				return root;
	}
	
	public Node FindInorderSuccessor(Node rootNode,Node node)
	{
		if(rootNode==null)
			return null;
		
		if(node.rightChild!=null)
			return findMin(node.rightChild);

		Node succ=null;
		while(rootNode!=null)
		{
			if(node.data<rootNode.data)
			{
				succ=rootNode;
				rootNode=rootNode.leftChild;
			}
			else if(node.data>rootNode.data)
				rootNode=rootNode.rightChild;
			else if(node.data==rootNode.data)
				break;
		}
		
		return succ;
	}
	
	
	public Node deleteNode(Node root,Node node)
	{
		Node succ=null;
		if(root==null)
			return null;
		if(root.data==node.data)
		{
			if(root.leftChild==null && root.rightChild==null)
			
			return null;
			
			else if(root.leftChild==null && root.rightChild!=null)
			
				return root.rightChild;
			else if(root.leftChild!=null && root.rightChild==null)
				
				return root.leftChild;
			
			else
			{
				succ= FindInorderSuccessor(root,node);
				succ.leftChild=root.leftChild;
				if(succ.data!=root.rightChild.data)
					succ.rightChild=root.rightChild;
				root.rightChild=deleteNode(root.rightChild,succ);
				    				
			}
			
		}
		
	    root.leftChild=deleteNode(root.leftChild,node);
		
		root.rightChild=deleteNode(root.rightChild,node);
		
		return root;
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
		
		Deletion insert=new Deletion();
		
		root=first;
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

		insert.inorder(root);
		
		System.out.println("\n");
		
		insert.deleteNode(root,eight);
		insert.inorder(root);
		

	}

}
