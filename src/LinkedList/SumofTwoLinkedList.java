package LinkedList;


public class SumofTwoLinkedList {

	Node head=null;

	public Node getHead()
	{
		return head;
	}

	public void InsertatEnd(Node node) 
	{
		if (head == null)
			head = node;
		else
		{
		node.next=head;
		head=node;
		}

	}
	public Node findSum(Node node1,Node node2)
	{
		if(node1==null && node2==null)
			return null;
		if(node1==null)
			return node2;
		if(node2==null)
			return node1;
		
		Node newHead=null;
		Node prev=null;
		int carry=0;
		int data=0;
		
		Node first=node1;
		Node second=node2;
		
		while(first!=null && second!=null)
		{
			int sum=first.data+second.data+carry;
			if(sum>=10)
			{
				carry=sum/10;		
			}
			else
				carry=0;
			
			data=sum%10;
			Node node=new Node(data);
			if(prev==null)
				newHead=node;
			else
			{
				prev.next=node;
			}
			prev=node;
			first=first.next;
			second=second.next;
		}
		
		
		return newHead;
	}


	public void traverseLinkedList(Node node)
	{
		Node current=node;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(5);
		Node n1 = new Node(6);
		Node n2 = new Node(3);
		Node n3=new Node(4);
		Node n4=new Node(5);
        Node n5=new Node(4);
		Node n6=new Node(4);
		Node n7=new  Node(2);




		SumofTwoLinkedList sum=new SumofTwoLinkedList();
		SumofTwoLinkedList sum1=new SumofTwoLinkedList();

		sum.InsertatEnd(n);
		sum.InsertatEnd(n1);
		sum.InsertatEnd(n2);
	  //sum.InsertatEnd(n3);	
      //sum.InsertatEnd(n4);	

		sum1.InsertatEnd(n5);
		sum1.InsertatEnd(n6);
		sum1.InsertatEnd(n7);


		sum.traverseLinkedList(sum.getHead());
		System.out.println("\n");
		sum1.traverseLinkedList(sum1.getHead());
		System.out.println("\n");
		Node Result=sum.findSum(sum.getHead(), sum1.getHead());
		sum.traverseLinkedList(Result);

	}

}
