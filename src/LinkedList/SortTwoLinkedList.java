package LinkedList;

public class SortTwoLinkedList {

	private Node head;
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
	
	
	public static void SortLinkedList(Node node1,Node node2)
	{
		Node firstCurrent=null;  
	    Node secondCurrent=null;
		
		if(node1.data<node2.data)
		{
			 firstCurrent=node1;  
		     
			 secondCurrent=node2;
		}
		else
		{ firstCurrent=node2;  
	     
		 secondCurrent=node1;
		}
		Node prev=null;
		Node temp=null;
		while(firstCurrent!=null && secondCurrent!=null)
		{
		if(firstCurrent.data<secondCurrent.data)
			{			
			prev=firstCurrent;
            firstCurrent=firstCurrent.next;
			}
		else if(firstCurrent.data>secondCurrent.data)
		{
		prev.next=secondCurrent;
		temp=secondCurrent.next;
		secondCurrent.next=firstCurrent;
		prev=secondCurrent;
		secondCurrent=temp;
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(17);
		Node n5 = new Node(1);
		Node n2 = new Node(31);

		Node n1 = new Node(20);
		Node n3 = new Node(22);
		Node n6 = new Node(5);
		Node n4 = new Node(53);
		
		
		Node a = new Node(11);
		Node b = new Node(12);
		Node c = new Node(13);

		Node d = new Node(14);
		Node e = new Node(15);
		Node f = new Node(18);
		Node g = new Node(19);
		
		
		SortTwoLinkedList merge=new SortTwoLinkedList();
		SortTwoLinkedList mergeSecond=new SortTwoLinkedList();

		
	    merge.InsertatEnd(n5);
		merge.InsertatEnd(n6);
		merge.InsertatEnd(n);
		merge.InsertatEnd(n1);
		
		
		merge.InsertatEnd(n3);
		
		
		merge.InsertatEnd(n2);
		merge.InsertatEnd(n4);
		
		
		
		mergeSecond.InsertatEnd(a);
		mergeSecond.InsertatEnd(b);
		mergeSecond.InsertatEnd(c);
		mergeSecond.InsertatEnd(d);
		mergeSecond.InsertatEnd(e);
		mergeSecond.InsertatEnd(f);
		mergeSecond.InsertatEnd(g);
		
		merge.traverseList(merge.getHead());
		System.out.println("\n");
		mergeSecond.traverseList(mergeSecond.getHead());
		
		
		SortLinkedList(merge.getHead(),mergeSecond.getHead());
		System.out.println("\n");
		merge.traverseList(merge.getHead());
		
		
	
		
	}

}
