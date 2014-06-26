package LinkedList;

public class SumAlternateNodes {
	public static Node head=null;
	int[] arr=new int[8];
	
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
	
	public int[] traverseList(Node head)
	{
		int i=0;
		Node current=head;
		while(current!=null)
		{
			arr[i]=current.data;
			System.out.print(current.data+"->");
			current=current.next;
			i++;
		}
		
		return arr;
	}
	
	public void sum(Node head,int[] arr)
	{
		int length=arr.length;
		Node current=head;
		int count=length-1;
		
		while(count>=length/2)
		{
			current.data=arr[count]-current.data;
			current=current.next;
			count--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(17);
		Node n5 = new Node(1);
		Node n2 = new Node(30);

		Node n1 = new Node(21);
		Node n3 = new Node(22);
		Node n6 = new Node(11);
		Node n4 = new Node(53);
		Node n7 = new Node(8);	
		SumAlternateNodes sum=new SumAlternateNodes();
		sum.InsertatEnd(n5);
		sum.InsertatEnd(n7);
		sum.InsertatEnd(n6);
		sum.InsertatEnd(n);
		sum.InsertatEnd(n1);
		sum.InsertatEnd(n3);
		
		
		sum.InsertatEnd(n2);
		sum.InsertatEnd(n4);

		
		int [] arr=sum.traverseList(head);
		System.out.println("\n");
		
		sum.sum(head, arr);
		System.out.println("\n");
		
		sum.traverseList(head);
	}

}
