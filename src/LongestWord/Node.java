package LongestWord;



public class Node {
	 char content;
	    Node[] child;
	    boolean marker;
	    
	    Node(char letter)
	    {
	        content = letter;
	        child = new Node[26];
	        marker = false;
	    }
	
}