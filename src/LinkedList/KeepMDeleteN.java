package LinkedList;

public class KeepMDeleteN {

	/**
	 * @param args
	 */
	Node head=null;
	
	public void insertLinkedList(Node node)
	{
		if(head==null)
		{
			head=node;
			return;
		}
		Node current=head;
		
		while(current!=null)
		{
			if(current.next==null)
			{
				current.next=node;
			node.next=null;
			return ;
		}
			current=current.next;
		}
	}
	
	public void traverseLinkedList(Node head)
	{
		if(head==null)
			return;
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
	}
	
	public void keepMNodeDelteNNode(Node head,int m,int n)
	{
		Node current=head;
		int count=0;
		Node prev=null;
		while(current!=null)
		{
			if(count<m && current!=null)
			{
			count++;
			prev=current;
			current=current.next;
			}
		 if(count>=m && current!=null)
			{
				count=0;
				while(count<n)
				{
					count++;
					Node temp=current.next;
					current=null;
					current=temp;;
					
				}
				count=0;
			}
			prev.next=current;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(17);
		Node n5 = new Node(1);
		Node n2 = new Node(30);

		Node n1 = new Node(21);
		Node n3 = new Node(22);
		Node n6 = new Node(11);
		Node n4 = new Node(53);
		Node n7 = new Node(8);	
		
		
		KeepMDeleteN keep=new KeepMDeleteN();
		keep.insertLinkedList(n);
		keep.insertLinkedList(n1);
		keep.insertLinkedList(n2);
		keep.insertLinkedList(n3);
		keep.insertLinkedList(n4);
		keep.insertLinkedList(n5);
		keep.insertLinkedList(n6);
		keep.insertLinkedList(n7);
		
		keep.traverseLinkedList(n);
		System.out.println("\n");
		keep.keepMNodeDelteNNode(n,4, 3);
		keep.traverseLinkedList(n);



	}

}
