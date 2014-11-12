package LinkedList;

public class SwapNodesataDistanceK {

	public static Node head=null; 
	public static void InsertatEnd(Node node) {
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
	public static void kswap(Node node,int k)
	{
		Node current=node;
		Node prev=node;
		int count=0;
		int temp=0;
		while(current!=null)
		{
			count++;
			if(count==k)
			{
				count=0;
				temp=prev.data;
				prev.data=current.data;
				current.data=temp;
				prev=current.next;

			}
			current=current.next;
		}


	}

	public static Node kswapNodes(Node node,int k)
	{
		Node current=node;
		Node first=node;
		Node prev=null;
		int count=0;
		Node temp=null;
		Node sexond=null;

		while(current!=null && count<k){
		
			prev=current;
			
			current=current.next;
			count++;
			if(count==k-1)
				sexond=prev;
		}
		if(first.next!=prev && current!=null)
		{
			temp=first.next;
			prev.next=temp;
			first.next=current;
			sexond.next=first;
		}
		
		if(current!=null)
			{
			node.next=kswapNodes(current, k);
		return prev;}
		else
			return first;
	}


	public static void traverseList(Node node) {
		Node current = node;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(1);

		Node n1 = new Node(2);
		Node n2 = new Node(3);

		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		Node n6 = new Node(7);
		Node n7=new Node(8);
		Node n8=new Node(9);
		Node n9=new Node(10);
		Node n10=new Node(11);


		InsertatEnd(n);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		InsertatEnd(n5);
		InsertatEnd(n6);
		InsertatEnd(n7);
		InsertatEnd(n8);
		InsertatEnd(n9);
		InsertatEnd(n10);


		traverseList(head);

		kswap(head, 3);
		System.out.println("\n");
		traverseList(head);

		System.out.println("\n");
		traverseList(kswapNodes(head, 3));

	}
}
