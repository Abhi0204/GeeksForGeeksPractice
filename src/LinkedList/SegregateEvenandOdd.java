package LinkedList;

public class SegregateEvenandOdd {

	private static Node head;
	public static Node last;
	public Node getHead() {
		return head;
	}

	public void InsertatEnd(Node node) {
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

	public void traverseList(Node node) {
		Node current = node;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	public Node Segregateeven(Node node1) {
		Node current = node1;
		Node evenHead = null;
		Node currenteven = evenHead;

		while (current != null) {
			Node evenNode = new Node(current.data);
			if (current.data % 2 == 0) {
				if (evenHead == null) {
					evenHead = evenNode;
					currenteven = evenNode;
				} else

					currenteven.next = evenNode;
				currenteven = evenNode;

			}
			current = current.next;
		}

		currenteven.next = null;
		return evenHead;

	}

	public Node Segregateodd(Node node1) {
		Node current = node1;
		Node oddHead = null;
		Node currentodd = oddHead;

		while (current != null) {
			Node oddNode = new Node(current.data);
			if (current.data % 2 != 0) {
				if (oddHead == null) {
					oddHead = oddNode;
					currentodd = oddNode;
				} else

					currentodd.next = oddNode;
				currentodd = oddNode;

			}
			current = current.next;
		}
		currentodd.next = null;
		return oddHead;

	}

	public static void MergeTwo(Node node1, Node node2) {
		Node current = node1;

		while (current.next != null) {
			current = current.next;
		}
		current.next = node2;

	}

	public static void merge(Node node)
	{
		Node current=node;
		Node prev=null;
		Node temp=null;
		Node lastNode=last;
		int count=0;
		while(current!=null)
		{	
			if(current.flag==true)
				break;
			else
				current.flag=true;

			if(current.data%2!=0)
			{
				temp=current.next;
				lastNode.next=current;

				lastNode=current;
				lastNode.next=null;
				
				if(prev!=null)
					prev.next=temp;
				
				current=temp;
			}
			else
			{
				count++;
				if(count==1)
				{
					head=current;
					
				}
				prev=current;
				current=current.next;

			}
		}
	}

	public static void getLast(Node node)
	{
		Node curr=node;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		last=curr;

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

		SegregateEvenandOdd GivenLinkedList = new SegregateEvenandOdd();
		SegregateEvenandOdd evenLinkedList = new SegregateEvenandOdd();
		SegregateEvenandOdd oddLinkedList = new SegregateEvenandOdd();

		GivenLinkedList.InsertatEnd(n);
		GivenLinkedList.InsertatEnd(n1);
		GivenLinkedList.InsertatEnd(n4);
		GivenLinkedList.InsertatEnd(n3);
		GivenLinkedList.InsertatEnd(n2);
		GivenLinkedList.InsertatEnd(n6);

		GivenLinkedList.InsertatEnd(n5);

		GivenLinkedList.traverseList(GivenLinkedList.head);

		getLast(GivenLinkedList.head);
		System.out.println("\n");
		merge(GivenLinkedList.head);
		GivenLinkedList.traverseList(GivenLinkedList.head);

		/*Node evenHead = GivenLinkedList.Segregateeven(GivenLinkedList.head);
		System.out.println("\n");

		evenLinkedList.traverseList(evenHead);
		Node oddHead = GivenLinkedList.Segregateodd(GivenLinkedList.head);
		System.out.println("\n");
		oddLinkedList.traverseList(oddHead);

		MergeTwo(evenHead, oddHead);
		System.out.println("\n");
		evenLinkedList.traverseList(evenHead);*/
	}

}
