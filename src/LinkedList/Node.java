package LinkedList;

public class Node {

	public Node next;
	public int data;
	String name;
	boolean flag=false;
	public Node child;
	
	
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
