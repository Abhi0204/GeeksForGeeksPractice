package LinkedList;

import java.util.HashMap;

public class LinkedListClone {
	public static Node head = null;

	public static Node originalHead=null;
	public static Node copyhead=null;
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

	public static void listTraverse(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "--->"+current.arbit.data+" ");

			current = current.next;

		}
	}

	public Node cloneLinkedList(Node head) {
		Node current = head;
		if (head == null)
			return null;
		Node copyHead =null;
		Node prev = null;
		HashMap<Node, Node> myMap = new HashMap<Node, Node>();
		while (current != null) {
			Node newCopyNode = new Node(current.data);
			
			myMap.put(current, newCopyNode);
			if (prev != null)
				prev.next = newCopyNode;
			else
				copyHead=newCopyNode;
			
			prev = newCopyNode;
			current = current.next;

		}
		current = head;
		Node newCurrent = copyHead;
		while (current != null && newCurrent != null) {
			newCurrent.arbit = myMap.get(current.arbit);
			current = current.next;
			newCurrent = newCurrent.next;
		}

		return copyHead;
	}

	
	public Node LinkedListCloning(Node head)
	{
		Node current=head;
		
		Node next=null;
		while(current!=null)
		{
			Node temp=new Node(current.data);
	         next=current.next;
	         current.next=temp;
	         temp.next=next;
	         current=next;
		}
		
		current=head;
		Node copyCurrent=current.next;
		while(current!=null && copyCurrent!=null)
		{
			copyCurrent.arbit=current.arbit.next;
			if(copyCurrent.next!=null)
			copyCurrent=copyCurrent.next.next;
			else
				copyCurrent=null;
		
			current=current.next.next;
		}
		
		current=head;
		copyCurrent=current.next;
		Node copyHead=copyCurrent;
		Node copyNext=null;
		
		while(current!=null && copyCurrent!=null)
		{
			Node currentNext=current.next.next;
			if(copyCurrent.next!=null)
			copyNext=copyCurrent.next.next;
			else
				copyNext=null;
			current.next=currentNext;
			copyCurrent.next=copyNext;
			current=currentNext;
			copyCurrent=copyNext;
		}
		
		return copyHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);

		n.arbit = n3;
		n1.arbit = n2;
		n2.arbit = n4;
		n3.arbit = n1;
		n4.arbit = n;

		LinkedListClone clone = new LinkedListClone();
		clone.InsertatEnd(n);
		clone.InsertatEnd(n1);
		clone.InsertatEnd(n2);
		clone.InsertatEnd(n3);
		clone.InsertatEnd(n4);

		listTraverse(head);

		System.out.println("\n");
		Node copyHead = clone.LinkedListCloning(head);
		listTraverse(copyHead);

	}

}
