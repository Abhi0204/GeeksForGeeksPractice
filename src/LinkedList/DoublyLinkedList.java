package LinkedList;

public class DoublyLinkedList {

	/**
	 * @param args
	 */
	public static Node root=null;
	public void insertDDLInkedList(Node node)
	{
		if(root==null)
		{
			root=node;
	    	return;
		}
		
		Node curr=root;
		while(curr!=null)
		{
			if(curr.next==null)
			{
				curr.next=node;
				node.prev=curr;
				return;
			}
			curr=curr.next;
		}
	}
	
	public void traverseDoublyL(Node root)
	{
	Node curr=root;
	while(curr!=null)
	{
		System.out.print(curr.data+"->");
		curr=curr.next;
	}
	}
	
	public void reverseDoublyLinkedList(Node root)
	{
		Node current=root;
		while(current!=null)
		{
			Node temp=current.next;
			current.next=current.prev;
			current.prev=temp;
			current=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(3);

		Node n1 = new Node(14);
		Node n2 = new Node(21);

		Node n3 = new Node(20);
		Node n4 = new Node(19);
		Node n5 = new Node(18);
		Node n6 = new Node(17);
		Node n7 = new Node(2);
		
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.insertDDLInkedList(n);
		dl.insertDDLInkedList(n1);
		dl.insertDDLInkedList(n2);
		dl.insertDDLInkedList(n3);
		dl.insertDDLInkedList(n4);
		dl.insertDDLInkedList(n5);
		dl.insertDDLInkedList(n6);
		dl.insertDDLInkedList(n7);


		dl.traverseDoublyL(root);
		dl.reverseDoublyLinkedList(root);
		System.out.println("\n");
		dl.traverseDoublyL(n7);
		
	}

}
