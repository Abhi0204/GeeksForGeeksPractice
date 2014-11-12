package LinkedList;

public class ReverseintheSizeofK{
	public static Node head = null;

	public static void InsertatEnd(Node node) {
		Node current = null;
		if (head == null)
			head = node;
		else {
			current = head;
			while (true) {
				if (current.next == null) {
					current.next = node;
					break;
				}
				current = current.next;
			}
		}

	}

	public static void listTraverse(Node node) {
		Node current = node;
		while (current != null) {

			System.out.print(current.data + "->");
			current = current.next;

		}
	}
	   
	public  static Node DeleteaLinkedList(Node node)
	{
		if(node==null)
			return null;
		
		node.next=DeleteaLinkedList(node.next);
		node=null;
		return null;
		
	}
	
	public  static void DeleteLinkedList(Node node)
	{
		Node current=node;
	    Node temp=null;
	
	while(current!=null)
	{
		temp=current.next;
		current=null;
		current=temp;
		
	}
	    head=null;
	}
	
	
	public static Node reverseLinkedListKtimes(Node node,int k)
	{
		Node current=node;
		Node prev=null;
		Node temp=null;
		int count=0;
		
		while(current!=null && count<k)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
			count++;
		}
		
		if(current!=null)
			node.next=reverseLinkedListKtimes(current,k);
		
		return prev;
	}
	
	public Node reverse(Node head)
	{
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		
		return prev;
	}
	public static Node reverseLinkedListKtimesIterative(Node head,int k)
	{
		Node current=head;
		Node prev=null;
		Node temp=null;
		int count=0;
		boolean flag=false;
		Node firstPrev=head;
		int a=0;
		Node newHead=null;
		while(current!=null)
		{
			if(count<k && !flag)
			{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
			count++;
			
			if(count==k)
			{
				if(a==0)
				{
					newHead=prev;
					a=1;
				}
				
		    	//System.out.println(firstPrev.data);
				//System.out.println(current.data);
				System.out.println(prev.data);
				firstPrev.next=current;
				count=0;
				flag=true;
			}
			
			if(current==null)
				firstPrev.next=prev;
		
			}
			else if(count<k && flag)
			{
				firstPrev=current;
				count++;
				current=current.next;
				if(count==k)	
				{   
					count=0;
					prev=null;
					flag=false;
				}
			}
		}
		return newHead;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(1);

		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		Node n6 = new Node(7);
		Node n7 = new Node(8);
		Node n8=new Node(9);
		Node n9=new Node(13);
		Node n10=new Node(14);
		Node n11=new Node(15);
		InsertatEnd(n);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		InsertatEnd(n5);
		InsertatEnd(n6);
		InsertatEnd(n7);
		InsertatEnd(n8);
	/*	InsertatEnd(n9);
		InsertatEnd(n10);
		InsertatEnd(n11);*/
        listTraverse(head);
		
		System.out.println("\n");
		Node newNode=reverseLinkedListKtimes(head, 2);
      //Node myNode=reverseLinkedListKtimesIterative(head, 3);
		listTraverse(newNode);
		System.out.println("\n");
		//listTraverse(myNode);
		
		

	}
}