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
		int carry=0;
		Node current1=node1;
		Node current2=node2;
		int sum=0;
		String result="";
		Node resultNodeHead=null;
		Node resultNode=null;
		int temp1=0;
		int temp2=0;
		while(current1!=null||current2!=null)
		{	
			if(current1==null)
				temp1=0;
			else
				temp1=current1.data;

			if(current2==null)
				temp2=0;
			else
				temp2=current2.data;
			if(carry==0)
				sum=temp1+temp2;
			else
				sum=temp1+temp2+carry;

			carry=sum/10;
			result=result+sum%10;

			if(resultNodeHead==null)
			{
				resultNodeHead=new Node(sum%10);
				resultNode=resultNodeHead;
			}
			else
			{
				resultNode.next=new Node(sum%10);	
				resultNode=resultNode.next;
			}

			if(current1!=null)
			current1=current1.next;
			if(current2!=null)
			current2=current2.next;
		}

		resultNode.next=null;

		return resultNodeHead;
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

		Node n5=new Node(8);
		Node n6=new Node(4);
		Node n7=new  Node(2);




		SumofTwoLinkedList sum=new SumofTwoLinkedList();
		SumofTwoLinkedList sum1=new SumofTwoLinkedList();

		sum.InsertatEnd(n);
		sum.InsertatEnd(n1);
		sum.InsertatEnd(n2);
		sum.InsertatEnd(n3);	
		sum.InsertatEnd(n4);	

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
