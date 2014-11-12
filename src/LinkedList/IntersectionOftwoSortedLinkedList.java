package LinkedList;

public class IntersectionOftwoSortedLinkedList {
	
	public static Node head=null;
	public static Node  head1=null;
	public static Node  head3=null;

	public static void Insertatfirst(Node node) {
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
	public static void Insertatsecond(Node node) {
		Node current = null;
		if (head1 == null)
			head1 = node;
		else {
			current = head1;
			while (true) {
				if (current.next == null) {
					current.next = node;
					break;
				}
				current = current.next;
			}
		}

	}
	public static void traverseList(Node node) {
		Node current =node;

		while (current != null) {
			System.out.print(current.name + "->");
			current = current.next;
		}
	}
	
	public static void instersection(Node node1,Node node2)
	{
		Node current1=node1;
		Node current2=node2;
		String result="";
		while(current1!=null && current2!=null)
		{
			if(current1.name.equalsIgnoreCase(current2.name))
			{
				
				result=result+current1.name+"->";
				
			}
			current1=current1.next;
			current2=current2.next;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(10, "Abhinav");
		Node n1 = new Node(20, "Gagan");
		Node n2 = new Node(30, "Varun");
		Node n3 = new Node(40, "Sablok");
		Node n4 = new Node(50, "Vasu");
		Node n5=new Node(60,"Singla");
		Node n6=new Node(70,"saraff");
		
		
		Node n7=new Node(1,"arya");
		Node n8=new Node(2,"beri");
		Node n9=new Node(3,"munaf");
		Node n10=new Node(10,"Abhinav");
		Node n11=new Node(20,"Gagan");
		Node n12=new Node(30,"Varun");
		Node n13=new Node(40,"Sablok");
		Node n14=new Node(50,"Vasu");
		Node n15=new Node(60,"Singla");
		Node n16=new Node(70,"saraff");
		
		Insertatfirst(n);

		Insertatfirst(n1);
		Insertatfirst(n2);
		Insertatfirst(n3);
		Insertatfirst(n4);
		Insertatfirst(n5);
		Insertatfirst(n6);
		traverseList(head);
		
		
		Insertatsecond(n7);
		Insertatsecond(n8);
		Insertatsecond(n9);
		Insertatsecond(n10);
		Insertatsecond(n11);
		Insertatsecond(n12);
		Insertatsecond(n13);
		Insertatsecond(n14);
		Insertatsecond(n15);
		Insertatsecond(n16);
		
		System.out.println("\n");
		traverseList(head1);
		
		System.out.println("\n");
          instersection(head, head1);
		
		
		

	}

}
