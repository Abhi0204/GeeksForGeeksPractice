package Queue;

import LinkedList.Node;

public class LinkedListQueue {

	
	final int Queue_size=6;
	static Node front=null;
	static Node last=null;
	public void Enqueue(Node node)
	{
		if(front==null && last==null)
		{
			front=node;
			last=node;
			return;
		}
		
		if(isFull(front)==false)
		{
			if(front.next==null)
			{
				front.next=node;
				last=node;
				return;
			}
		last.next=node;
		last=node;
		return;
			
		}
		System.out.println("Queue is Full, Cannot insert "+ node.data);

	}
	
	public void Dequeue()
	{
		if(isEmpty(front)==false)
		{
			Node temp=front.next;
			System.out.println("Node Dequeued "+front.data);
			front=temp;
			return;
		}
		
		System.out.println("Queue is Empty");
	}
	
	public boolean isEmpty(Node front)
	{
		if(front==null)
			return true;
		
		return false;
	}
	
	public boolean isFull(Node front)
	{
	 if(front==null)
		 return false;
	 
	 Node current=front;
	 int count=0;
	  while(current!=null)
	  {
		  count++;
		  current=current.next;
	  }
	  if(count>=Queue_size)
		  return true;
	  
	  return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		LinkedListQueue link=new  LinkedListQueue();

		Node n = new Node(17);
		Node n5 = new Node(1);
		Node n2 = new Node(31);

		Node n1 = new Node(20);
		Node n3 = new Node(22);
		Node n6 = new Node(11);
		Node n4 = new Node(53);
		
		link.Enqueue(n);
		link.Enqueue(n1);
	    link.Enqueue(n2);
		link.Enqueue(n3);
		link.Enqueue(n4);
		link.Enqueue(n5);
		//link.Enqueue(n6);
		
		
		link.Dequeue();
		link.Dequeue();
		link.Dequeue();

		


         
		
	}

}
