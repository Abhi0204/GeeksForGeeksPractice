package PatternSearching;

import java.util.ArrayList;

public class Node {
	
	Node[] NodeArr;
	char letter;
	boolean marker;
	int count;
	ArrayList arr;
	
	
	public Node(char letter)
	{
		NodeArr=new Node[26];
		this.letter=letter;
		marker=false;
		arr=new ArrayList<Integer>();
	}
}
