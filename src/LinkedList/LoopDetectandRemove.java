package LinkedList;


public class LoopDetectandRemove {

	static Node head;


	public  void InsertatEnd(Node node) 
	{
		Node current = null;
		if (head == null)
			head = node;
		else
		{
			current = head;
			while (true) 
			{
				if (current.next == null) 
				{
					current.next = node;
					break;
				}
				current = current.next;
			}
		}

	}
	
	
	public  static void traverseLinkedList(Node node)
	{
		Node current=node;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
	}
	
	//Floyd Warshall Cycle Detection and Removal
	public void findALoop(Node node)
	{
		Node slow_pointer=node;
		Node fast_pointer=node;
		int count=1;
		
		while(slow_pointer!=null && fast_pointer!=null)
		{
			slow_pointer=slow_pointer.next;
			fast_pointer=fast_pointer.next.next;
			
			if(slow_pointer==fast_pointer)
				break;
		}
		
		Node next=slow_pointer;
		while(next.next!=slow_pointer)
		{
			count++;

			next=next.next;
			
		}

		Node curr=head;
		int k=1;
		while(k<=count)
		{
			curr=curr.next;
			k++;
		}
		
		
		Node newNode=head;
		while(curr!=newNode)
		{
			
			curr=curr.next;
			newNode=newNode.next;
		}
		
		Node start=curr;
		while(true)
		{
			if(curr.next==start)
			{
			curr.next=null;
			break;
			}
			
			curr=curr.next;
		}
		
	}
	
	public void findBeginningoFaLoop(Node node)
	{
		Node slow_pointer=node;
		Node fast_pointer=node;
	
		
		while(slow_pointer!=null && fast_pointer!=null)
		{
			slow_pointer=slow_pointer.next;
			fast_pointer=fast_pointer.next.next;
			
			if(slow_pointer==fast_pointer)
				break;
		}
		
	slow_pointer=head;
	while(slow_pointer!=fast_pointer)
	{
		slow_pointer=slow_pointer.next;
		fast_pointer=fast_pointer.next;
	}
	
	System.out.println(fast_pointer.data);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(10, "Abhinav");
		Node n1 = new Node(20, "Gagan");
		Node n2 = new Node(30, "Varun");
		Node n3 = new Node(40, "Sablok");
		Node n4 = new Node(50, "Vasu");
		Node n5 = new Node(60, "Vine");
		Node n6 = new Node(70, "Karan");
		Node n7 = new Node(80, "Kaul");

		
		
		LoopDetectandRemove sum=new LoopDetectandRemove();
		
		sum.InsertatEnd(n);
		sum.InsertatEnd(n1);
		sum.InsertatEnd(n2);
		sum.InsertatEnd(n3);
		sum.InsertatEnd(n4);
		sum.InsertatEnd(n5);
		sum.InsertatEnd(n6);
		sum.InsertatEnd(n7);
		sum.InsertatEnd(n3);

		
		//sum.findALoop(head);
		sum.findBeginningoFaLoop(head);
	//	traverseLinkedList(head);

	}

}
