package LinkedList;

public class ReverseKnodes {
    public static Node head=null;

	public static void InsertatEnd(Node node) {
		Node current = null;
		if (head == null)
			head = node;
		else {
			current = head;
			while (true) {
				if (current.next == null) {
					current.next = node;
					node.next = null;
					break;
				}
				current = current.next;
			}
		}

	}
	public static Node kreverse(Node node,int k)
	{
		if(node.next==null)
			return node;
		
		
		
	}

	public static void traverseList(Node node) {
		Node current = node;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
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


		InsertatEnd(n);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		InsertatEnd(n5);
		InsertatEnd(n6);
		traverseList(head);
		
		kreverse(head,3);
	
		System.out.println("\n");
		traverseList(head);
		
	}

}
