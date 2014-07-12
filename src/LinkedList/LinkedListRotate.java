package LinkedList;

public class LinkedListRotate  {

	public static Node head;
	public void InsertatEnd(Node node) {
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
	
	public Node rotateLinkedList(Node node,int k)
	{
		if(node==null)
			return null;
		
		Node current=node;
		int count=0;
		Node last=getLast(node);
		Node temp=null;
		while(count<k)
		{
			last.next=current;
			temp=current.next;
			current.next=null;
			last=current;
			current=temp;
			count++;
			
		}
		
		return current;
	}
	
	public Node getLast(Node node)
	{
		Node curr=node;
		while(curr.next!=null)
			curr=curr.next;
		
		return curr;
	}
	

	public static void listTraverse(Node node) {
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

		LinkedListRotate rotate=new LinkedListRotate();
		
		rotate.InsertatEnd(n);

		rotate.InsertatEnd(n1);
		rotate.InsertatEnd(n2);
		rotate.InsertatEnd(n3);
		rotate.InsertatEnd(n4);
		
		
		
		System.out.println("\n");
		
		
		listTraverse(head);
		
		System.out.println("\n");
		listTraverse(rotate.rotateLinkedList(head, 3));

		
	}

}
