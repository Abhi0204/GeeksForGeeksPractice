package LinkedList;

public class MergeatAlternatePosition {

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

	
	public void MergeList(Node node1,Node node2)
	{
		Node temp=null;
		Node current1=node1;
		Node current2=node2;
		Node temp2=null;
		
		while(current1!=null && current2!=null)
		{
			temp=current1.next;
			current1.next=current2;
			temp2=current2.next;
			current2.next=temp;
			current2=temp2;
			current1=current1.next.next;
		}
	}
	
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Node n = new Node(17);
				Node n5 = new Node(1);
				Node n2 = new Node(31);

				Node n1 = new Node(20);
				Node n3 = new Node(22);
				Node n6 = new Node(11);
				Node n4 = new Node(53);
				
				
				Node a = new Node(1);
				Node b = new Node(2);
				Node c = new Node(3);

				Node d = new Node(4);
				Node e = new Node(5);
				Node f = new Node(6);
				Node g = new Node(7);
				
				
				MergeatAlternatePosition merge=new MergeatAlternatePosition();
				MergeatAlternatePosition mergeSecond=new MergeatAlternatePosition();

				
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
				//mergeSecond.InsertatEnd(f);
				//mergeSecond.InsertatEnd(g);
				
				merge.traverseList(merge.getHead());
				System.out.println("\n");
				mergeSecond.traverseList(mergeSecond.getHead());
				
				
				merge.MergeList(merge.getHead(), mergeSecond.getHead());
				System.out.println("\n");
				merge.traverseList(merge.getHead());
			
				

			}
}