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
	
	public Node deleteNode(Node root,int key)
	{
		if(root==null)
			return null;
		if(root.data==key)
		{
			if(root.leftChild==null && root.rightChild==null)
			
			return null;
			
			else if(root.leftChild==null && root.rightChild!=null)
			
				return root.rightChild;
			else if(root.leftChild!=null && root.rightChild==null)
				
				return root.leftChild;
			
		}
		
	    root.leftChild=deleteNode(root.leftChild, key);
		
		root.rightChild=deleteNode(root.rightChild, key);
		
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
		insert.inorder(root);
		
		System.out.println("\n");
		insert.deleteNode(root,50);
		insert.inorder(root);

	}

}
