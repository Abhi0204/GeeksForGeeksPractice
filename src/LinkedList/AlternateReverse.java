package LinkedList;

public class AlternateReverse {
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
	public static Node Alternatereverse(Node node,int k)
	{

		Node current=node;
		Node temp=null;
		Node prev=null;
		int count=0;
		int check=0;
		Node nextNode=null;
		while(current!=null && count<k)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;

			count++;
		}

		if(node!=null)
		node.next=current;
		while(current!=null && check<k)
		{
			nextNode=current;
			current=current.next;
			check++;
		}

		if(current!=null)
			nextNode.next=Alternatereverse(current,k);

		return prev;	

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
		Node n = new Node(10, "Abhinav");
		Node n1 = new Node(20, "Gagan");
		Node n2 = new Node(30, "Varun");
		Node n3 = new Node(40, "Sablok");
		Node n4 = new Node(50, "Vasu");
		Node n5 = new Node(60, "Singla");
		Node n6 = new Node(70, "saraff");

		Node n7 = new Node(80, "arya");
		Node n8 = new Node(90, "beri");
		Node n9 = new Node(100, "munaf");
		Node n10 = new Node(110, "Abhinav");
		Node n11 = new Node(120, "Gagan");
		Node n12 = new Node(130, "Varun");
		Node n13 = new Node(140, "Sablok");
		Node n14 = new Node(150, "Vasu");
		Node n15 = new Node(160, "Singla");
		Node n16 = new Node(170, "saraff");

		InsertatEnd(n);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		InsertatEnd(n5);
		InsertatEnd(n6);
		InsertatEnd(n7);
		/*InsertatEnd(n8);
		InsertatEnd(n9);
		InsertatEnd(n10);
		InsertatEnd(n11);
		InsertatEnd(n12);
		InsertatEnd(n13);
		InsertatEnd(n14);
		InsertatEnd(n15);
	InsertatEnd(n16);*/

		traverseList(head);

System.out.println("\n");
Node newNode=Alternatereverse(head, 3);
traverseList(newNode);

	}


}
