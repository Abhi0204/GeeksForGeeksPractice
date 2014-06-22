package LinkedList;

import java.util.HashSet;
import java.util.Iterator;

import org.w3c.dom.ls.LSInput;

public class RemoveDuplicates {
	
	static Node head;
	static HashSet<Node> uniqueSet=new HashSet<Node>();
 	public static void InsertatEnd(Node node) {
		Node current = null;
		if (head == null)
			head = node;
		else {
			current = head;
			while (true) {
				if (current.next == null) {
					current.next = node;
					node.next=null;
					break;
				}
				current = current.next;
			}
		}

	}
	public static void listTraverse(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.name + "->");
			current = current.next;

		}
	}
	
	public static void listDup(Node head) {
		Node current = head;
		
		if(head==null)
		{
			System.out.println("List Empty");
		}
		while (current != null) {
			if(current.next==null)
				break;
			if(current.name==current.next.name)
			{
				Node temp=current.next;
				current.next=temp.next;
				temp=null;
			}
			else
			{
			current = current.next;
			}

		}
	}
	
	public static void listDupUnsorted(Node head) {
		Node current = head;
		
		if(head==null)
		{
			System.out.println("List Empty");
		}
		while (current != null) {
			
			if(!uniqueSet.contains(current))
				uniqueSet.add(current);
			
			current=current.next;
					
		}
		for(Node n:uniqueSet)
			System.out.println(n.name);
		Insert(uniqueSet);
	}
	public static void Insert(HashSet<Node> hashNode) {
		Iterator<Node> iterator=hashNode.iterator();
		
  		while(iterator.hasNext())
  		{
  			System.out.print(iterator.next().name+"->");
  		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(10, "Abhinav");
		Node n5 = new Node(10, "Abhinav");
		Node n2 = new Node(30, "Varun");

		Node n1 = new Node(20, "Gagan");
		Node n3 = new Node(40, "Sablok");
		Node n6= new Node(10, "Abhinav");
		Node n4 = new Node(50, "Vasu");
		


		InsertatEnd(n);
		InsertatEnd(n1);
		InsertatEnd(n4);
		InsertatEnd(n3);
		InsertatEnd(n);

		InsertatEnd(n6);
		InsertatEnd(n4);
		
		/*listTraverse(head);
		listDup(head);
		
		System.out.println("\n");
     	listTraverse(head);*/
	
	
	listDupUnsorted(head);
	
	

	
	}

}
