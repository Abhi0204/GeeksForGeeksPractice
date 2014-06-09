package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {
	static Node head = null;

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
	

	public static void InsertLikeStack(Node node) {
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

	public static void Insertatbegin(Node node) {
		Node current = head;
		if (head == null)
			head = node;
		else {
			head = node;
			node.next = current;
		}

	}

	public static void InsertinBetween(Node node, int n) {
		Node current = head;
		if (head == null)
			head = node;
		int count = 0;

		while (current != null) {
			if (count == n - 2) {
				Node temp = current.next;
				current.next = node;
				node.next = temp;
				break;
			}
			current = current.next;
			count++;
		}

	}

	public static void DeleteinBetween(int n) {
		Node current = head;

		int count = 0;

		while (current != null) {
			count++;

			if (count == n - 1) {
				Node temp = current.next.next;
				current.next = temp;
				break;
			}
			current = current.next;
					}

	}

	public static void DeleteatEnd() {
		Node current = head;

		while (current != null) {
			if (current.next.next == null) {
				current.next = null;
			}
			current = current.next;

		}

	}

	public static void DeleteatBegin() {
		head = head.next;

	}
	
	public static void Deletegiven(Node node) {
		node.data=node.next.data;
		node.name=node.next.name;
		node.next=node.next.next;

	}

	public static void listTraverse(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;

		}
	}
	
	public static void listTraverseSingleNode(int n) {
		Node current = head;
		int count=0;
		while (current != null) {
			count++;
			if(count==n)
			System.out.print(current.data + "->");
			
			current = current.next;

		} 
	}
	
	public static void listLength(Node node) {
		Node current = head;
		int count=0;
		while (current != null) {
		
			
			current = current.next;
			count++;
		}
		System.out.println("Count is "+count);
	}

	public static void Insert()
	{
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
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// To insert into a LinkedList
		Insert();
		
		System.out.println("Inserting in the LinkedList in the end");
		listTraverse(head);
		System.out.println("\n");

		System.out.println("Inserting in the LinkedList n the begining");
		Node n5 = new Node(60, "Saraff");
		Insertatbegin(n5);
		listTraverse(head);
System.out.println("\n");
		listLength(head);
		System.out.println("\n");
		System.out.println("Inserting in the LinkedList in between");
		Node n6 = new Node(70, "Anuj");
		InsertinBetween(n6, 6);

		listTraverse(head);

		System.out.println("\n");

		System.out.println("Delete a node in between");
		DeleteinBetween(4);

		listTraverse(head);

		System.out.println("\n");
		System.out.println("Delete a node at the End");
		DeleteatEnd();

		listTraverse(head);

		System.out.println("\n");
		System.out.println("Delete a node at the Begin");
		//DeleteatBegin();

		listTraverse(head);
		
		System.out.println("\n");
		listTraverseSingleNode(1);
		

	}

}
