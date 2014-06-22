package LinkedList;

public class Node {

	Node next;
	int data;
	String name;
	boolean flag=false;
	
	
	public Node(int data,String name)
	{
		
		this.name=name;
		this.data=data;
	}
	public Node(int data)
	{
		
	
		this.data=data;
	}
}
