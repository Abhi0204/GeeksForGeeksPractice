package LinkedList;

public class PalindromeLinkedList {
public static Node  head=null;
	public static void InsertatEnd(Node node)
	{
		if(head==null)
			head=node;
		Node current=head;
		while(current!=null)
		{
			if(current.next==null)
			{
			current.next=node;
			node.next=null;
			}
			current=current.next;
		}
		
	}
	
	public static void listTraverse(Node node)
	{
		Node current=node;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
	
	}
	public static Node getMiddle(Node node)
	{
		if(node==null)
			return node;
		
		Node slow_pointer=node;
		Node fast_pointer=node;
		
		while(fast_pointer!=null && fast_pointer.next!=null)
		{
			slow_pointer=slow_pointer.next;
			fast_pointer=fast_pointer.next.next;
		}
		System.out.println(slow_pointer.data);
		return slow_pointer;
	}
	
	public static Node reverseLinkedListAfterMiddle()
	{
		Node middle=getMiddle(head);
		Node prev=null;
		Node current=middle.next;
		Node temp=null;
		while(current!=null)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		
		middle.next=prev;
		
		return middle;
		
	}
	
	
	public static boolean checkPalindrome(Node node)
	{
		if(node==null)
			return true;
		Node current=head;
		Node middle=reverseLinkedListAfterMiddle();
		Node next_current=middle.next;
		
		while(next_current!=null)
		{
			if(current.data!=next_current.data)
				return false;
			current=current.next;
			next_current=next_current.next;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(60);
		
		Node n3 = new Node(20);
		Node n4 = new Node(10);
		
		InsertatEnd(n);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		
		
		listTraverse(head);
		
		
		System.out.println("\n");
		
		System.out.println(checkPalindrome(head));
		
	}

}
