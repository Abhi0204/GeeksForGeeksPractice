package LinkedList;

public class FlattenedLinkedList {

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

	public Node getLast(Node node)
	{
		Node current=node;
		while(current.next!=null)
		
			current=current.next;
		
		
		return current;
		
	}
	
	
	public void flattenLinkedList(Node node)
	{
		Node current=node;
		Node last=getLast(node);
	while(current!=null)
	{
		if(current.child!=null)
			{
			last.next=current.child;
		    last=current.child;
		    
		    while(last.next!=null)
		    	last=last.next;
			}
		current=current.next;
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node a = new Node(1);
		a.child=new Node(10);
		Node b = new Node(2);
		b.child=new Node(20);
		b.child.child=new Node(100);
		b.child.child.next=new Node(120);
		Node c = new Node(3);
		c.child=new Node(30);

		Node d = new Node(4);
		d.child=new Node(40);
		Node e = new Node(5);
		e.child=new Node(50);
		Node f = new Node(6);
		f.child=new Node(60);
		Node g = new Node(7);
		g.child=new Node(70);
		
		FlattenedLinkedList flat=new FlattenedLinkedList();
		flat.InsertatEnd(a);
		flat.InsertatEnd(b);
		flat.InsertatEnd(c);
		flat.InsertatEnd(d);
		flat.InsertatEnd(e);
		flat.InsertatEnd(f);
		flat.InsertatEnd(g);
		
		
		flat.flattenLinkedList(flat.getHead());
		System.out.println("\n");
		flat.traverseList(flat.getHead());
		
		
		
	}

}
