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
			if (current.data > max) {
				max = current.data;
				prev = current;
			} else {
				
				prev.next = temp;
				current = null;

			}
			current=temp;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(12);

		Node n1 = new Node(15);
		Node n2 = new Node(10);

		Node n3 = new Node(11);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		Node n6 = new Node(2);
		Node n7 = new Node(3);
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
		
		
	}

}
