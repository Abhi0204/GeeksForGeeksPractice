package LinkedList;

public class PAirwieseSwap {

	static Node head;

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

	public static void moveLastToFirst(Node node)
	{
		Node first=node;
		Node current=node;

		while(current.next!=null)
		{
			if(current.next.next==null)
			{
				Node temp=first.next;
				Node last=current.next;
				current.next=first;
				first.next=null;
				first=last;
				first.next=temp;

				head=first;
			}

			current=current.next;
		}
	}

	public static void traverseList(Node head) {
		Node current = head;

		while (current != null) {
			System.out.print(current.name + "->");
			current = current.next;
		}
	}

	public static Node pairWise(Node head)
	{
		Node current=head;
		Node prev=null;
		Node newHead=null;
		while(current!=null)
		{
			Node temp=current.next;
			if(temp!=null)
			{
				Node tempNext=temp.next;
				temp.next=current;
				current.next=tempNext;
				if(prev==null)
					newHead=temp;
				else
					prev.next=temp;

				prev=current;

				current=tempNext;
			}
			else{

				prev.next=current;
				current=temp;
			}

		}

		return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n = new Node(10, "Abhinav");
		Node n1 = new Node(20, "Gagan");
		Node n2 = new Node(30, "Varun");
		Node n3 = new Node(40, "Sablok");
		Node n4 = new Node(50, "Vasu");
		Node n5 = new Node(50, "Anuj");

		InsertatEnd(n);
		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		//InsertatEnd(n5);
		traverseList(head);
		System.out.println("\n");

		Node tt=pairWise(head);
		traverseList(tt);

	}

}
