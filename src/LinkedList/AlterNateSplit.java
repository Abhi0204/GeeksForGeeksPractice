package LinkedList;

public class AlterNateSplit {

	/**
	 * @param args
	 */
	
	static Node head=null;
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
		while (current != null) {

			System.out.print(current.data + "->");
			current = current.next;

		}
	}
	
	public Node AlterNate(Node node)
	{
		if(head==null)
			return null;
		
		Node newHead=head.next;
		
		Node current=head;
		Node currentNew=newHead;
		while(current!=null && currentNew!=null)
		{
			if(current.next!=null)
			current.next=current.next.next;
			else
				current.next=null;
			if(currentNew.next!=null)
			currentNew.next=currentNew.next.next;
			else
				currentNew.next=null;
			
			current=current.next;
			currentNew=currentNew.next;
		}
		
		return newHead;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(0);
		Node n2 = new Node(1);

		Node n3 = new Node(0);
		Node n4 = new Node(1);
		Node n5 = new Node(0);
		Node n6 = new Node(1);
		Node n7 = new Node(0);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		/*InsertatEnd(n5);
		InsertatEnd(n6);
		InsertatEnd(n7);*/
		listTraverse(head);
		System.out.println("\n");
		AlterNateSplit al=new AlterNateSplit();
		Node n=al.AlterNate(n1);
		listTraverse(n);
		System.out.println("\n");
		listTraverse(n1);
	}

}
