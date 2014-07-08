package Stacks;

import LinkedList.Node;

public class StackOperations {

	public static Node head=null;
	//Array Implementations
	public boolean isStackEmpty(Stack stack)
	{
		return stack.top==-1;
	}
	public boolean isStackFull(Stack stack)
	{		return stack.top==stack.capacity-1;

	}
	
	public void push(Stack stack,int item)
	{
		if(isStackFull(stack)==true)
			return;
		stack.top=stack.top+1;
		stack.arr[stack.top]=item;
		System.out.println(item+" Pushed");
	}
	public void pop(Stack stack)
	{
		if(isStackEmpty(stack)==true)
			return;
	    
	 	System.out.println(stack.arr[stack.top]+" Popped");
	 	 stack.arr[stack.top]=0;
	     stack.top--;
		
	}
	
	public void peek(Stack stack)
	{
		System.out.println(stack.arr[stack.top]+" Peeked");
	}
	
	//LinkedList Implementation
	
	public boolean isEmptyLinkedList(Node head)
	{
		if(head==null)
			return true;
		else return false;
	}
	
	public void pushLinkedList(Node node)
	{
      node.next=head;
      head=node;
	}
	
	
	public void popLinkedList()
	{
		Node temp=head;
     head=head.next;
     System.out.println(temp.data+" "+"Popped");
	}
	public void peekLinkedList()
	{
	
     System.out.println(head.data+" "+"is the Top");
	}
	
	public void TraverseLinkedList(Node head)
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackOperations stackOp=new StackOperations();
		Stack stack=new Stack();
		stackOp.push(stack,10);
		stackOp.push(stack,20);
		stackOp.push(stack,30);
		stackOp.push(stack,40);
		
		/*System.out.println("\n");
		stackOp.pop(stack);
		
	    stackOp.peek(stack);
		System.out.println("\n");
*/
		Node n = new Node(17);
		Node n5 = new Node(1);
		Node n2 = new Node(30);

		Node n1 = new Node(21);
		Node n3 = new Node(22);
		Node n6 = new Node(11);
		
		stackOp.pushLinkedList(n);
		stackOp.pushLinkedList(n1);
		stackOp.pushLinkedList(n2);
		stackOp.pushLinkedList(n3);
        stackOp.pushLinkedList(n6);
		stackOp.pushLinkedList(n5);

		System.out.println("\n");
		stackOp.TraverseLinkedList(head);
		System.out.println("\n");
		stackOp.popLinkedList();
		stackOp.TraverseLinkedList(head);
		System.out.println("\n");
		
		stackOp.peekLinkedList();
	}

}
