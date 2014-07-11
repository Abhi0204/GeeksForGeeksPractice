package LinkedList;

public class DeleteNodesGreateratright {

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

	public static void reverseList(Node node) {

		Node prev = null;
		Node temp;
		Node current = node;
		while (current != null) {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}

		head = prev;
	}

	public static void listTraverse(Node node) {
		Node current = node;
		while (current != null) {

			System.out.print(current.data + "->");
			current = current.next;

		}
	}

	public static void findgreate(Node node) {
		Node current = node;
		Node prev = null;
		int max = 0;

		while (current != null) {
			Node temp = current.next;
			if (current.data > max) 
			{
				max = current.data;
				prev = current;
			} 
			else
			{

				prev.next = temp;
				current = null;

			}
			current=temp;

		}
	}

	
	public static Node recurseFindGreater(Node node)
	{
		if(node.next==null)
			return node;
		Node n=recurseFindGreater(node.next);
		if(n.data>node.data)
		{
			node.data=n.data;
			node.next=n.next;
			n=null;
		}
		else
			node.next=n;
		return node;
		
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

		reverseList(head);
		System.out.println("\n");
		listTraverse(head);

		findgreate(head);

		System.out.println("\n");
		listTraverse(head);

		reverseList(head);
		System.out.println("\n");
		listTraverse(head);
		
		System.out.println("\n");

		
		System.out.println("*******************");
		listTraverse(recurseFindGreater(head));


	}

}
