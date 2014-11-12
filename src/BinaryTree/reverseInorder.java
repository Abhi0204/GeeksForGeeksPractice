package BinaryTree;

public class reverseInorder {
	
	static Node prev=null;
	public void  inorder(Node root)
	{
		if(root==null)
			return;
		
		inorder(root.rightChild);
		if(prev==null)
			prev=root;
		else
		{
			root.next=prev;
			prev=root;
		}
		inorder(root.leftChild);
	}
	
	
	public void traverse(Node root)
	{
		Node curr=root;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
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
		
		reverseInorder reverse=new reverseInorder();
		reverse.inorder(root);
		reverse.traverse(root.leftChild.leftChild);
	}

}
