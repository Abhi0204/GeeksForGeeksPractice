package Tries;

public class Node {

	Node [] children;
	char letter;
	boolean marker;
	
	
	public Node(char letter)
	{
		marker=false;
		children=new Node[26];
		this.letter=letter;
	}
}
