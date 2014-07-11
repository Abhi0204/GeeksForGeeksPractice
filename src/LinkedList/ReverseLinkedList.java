package LinkedList;

public class ReverseLinkedList  {

	static Node head;
	static Node head2;
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
	
	public static void reverseList (Node node)
	{
		
		Node prev=null;
		Node temp;
		Node current=node;	
		while(current!=null)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		
		head=prev;
	}
	public static Node recursereverseList (Node node)
	{
		
		if(node.next==null)
			return node;
		Node n=recursereverseList(node.next);
		node.next.next=node;
		node.next=null;		
		return n;
	}
	

	public static void listTraverse(Node node) {
		Node current = node;
		while (current != null) {
			
			System.out.print(current.name + "->");
			current = current.next;

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Node n = new Node(10, "Abhinav");
		Node n1 = new Node(20, "Gagan");
		Node n2 = new Node(30, "Varun");
		Node n3 = new Node(40, "Sablok");
		Node n4 = new Node(50, "Vasu");

		InsertatEnd(n);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		
	//	listTraverse(head);
		
		
		System.out.println("\n");
	//	recursereverseList(head);
		
		
		listTraverse(recursereverseList(head));

		
	}

}
