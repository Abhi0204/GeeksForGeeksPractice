package BinarySearchTree;

public class Serarching {
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
	
	public boolean searchNode(Node root,int key)
	{
		if(root==null)
			return false;
		if(root.data==key)
			return true;
		if(root.data>key)
			return searchNode(root.leftChild, key);
		else if(root.data<key)
			return searchNode(root.rightChild,key);
			
		return false;
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
		
		
		Serarching insert=new Serarching();
	
		root=first;
		insert.insertBSt(root,second);

		insert.insertBSt(root,third);
		insert.insertBSt(root,fourth);
		insert.insertBSt(root,fifth);
		insert.insertBSt(root,sixth);
		insert.insertBSt(root,seventh);
		
		System.out.println(insert.searchNode(root,80));
	}

}
