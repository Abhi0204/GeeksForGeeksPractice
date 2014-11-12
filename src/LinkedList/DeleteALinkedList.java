package LinkedList;

public class DeleteALinkedList {

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
		InsertatEnd(n);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		InsertatEnd(n5);
		InsertatEnd(n6);
		InsertatEnd(n7);
		listTraverse(head);
		
		DeleteaLinkedList(head);
		System.out.println("\n");
		listTraverse(head);

		
		
		
	}

}
