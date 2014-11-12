package LinkedList;


public class NthNodeFromtheEnd {
	public static Node head = null;

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
	
	
	public Node getNthFromtheLast(Node node,int k)
	{
	Node curr=node;
	int count=getLast(node);
	int index=count-k;
	int j=0;
	while(curr!=null)
	{
		if(j==index)
			return curr;
		j++;
		curr=curr.next;
	}
	
	return null;
	}
	

	public Node getNthFromtheStart(Node node,int k,int count)
	{
	if(node==null)
		return null;
	if(k==count)
		return node;
	return getNthFromtheStart(node.next,k,count+1);
	}
	
	public int RecursiongetNthFromtheLast(Node node,int k)
	{
		
		if(node==null)
			return 0;
		int count=RecursiongetNthFromtheLast(node.next, k)+1;
		if(count==k)
			System.out.println(node.data);
		
			return count;
		
		
	}
	public int getLast(Node node)
	{
		int count=0;
		Node curr=node;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(3);

		Node n1 = new Node(14);
		Node n2 = new Node(21);

		Node n3 = new Node(20);
		Node n4 = new Node(19);
		Node n5 = new Node(18);
		Node n6 = new Node(17);
		Node n7 = new Node(2);
		InsertatEnd(n);

		InsertatEnd(n1);
		InsertatEnd(n2);
		InsertatEnd(n3);
		InsertatEnd(n4);
		InsertatEnd(n5);
		InsertatEnd(n6);
		InsertatEnd(n7);
		listTraverse(head);
		
		NthNodeFromtheEnd nthNode=new NthNodeFromtheEnd();
		System.out.println("\n");
		System.out.println(nthNode.getNthFromtheLast(head, 3).data);
	     nthNode.RecursiongetNthFromtheLast(head, 3);
	     System.out.println("\n");
	    System.out.println(nthNode.getNthFromtheStart(head, 3,1).data);

	}

}
