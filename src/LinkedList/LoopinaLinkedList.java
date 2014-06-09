package LinkedList;

import java.util.HashSet;

public class LoopinaLinkedList {

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

	public static void listTraverse(Node node) {
		Node current = node;
		Node next=node;
		HashSet<Node> hashNode=new HashSet<Node>();
		while (current != null) {

			//Using Hashing to find a loop in a singly linked List
			if(hashNode.contains(current))
			{
				System.out.println("List has a loop");

				break;
			}
			hashNode.add(current);

			//Using a boolean flag/visited flag
			if(current.flag==false)
				current.flag=true;
			else
			{
				System.out.println("List has a loop");

				break;
			}
			
			
			//Using two pointers ,fast and slow incrementing one by 1 and the other by 2
		
			System.out.print(current.name + "->");
			current = current.next;
			if(node.next==null)
			{
				System.out.println("List doesnt have a loop");

				break;
			}
			node=node.next.next;
			
			if(current==node)
			{
				System.out.println("List has a loop");

				break;
			}
			
			
			
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
		//InsertatEnd(n3);
		listTraverse(head);

	}

}
