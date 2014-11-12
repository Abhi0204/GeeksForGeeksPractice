package BinaryTree;

public class Node {

	int data;
	Node leftChild;
    Node rightChild;
    Node nextRight;
    Node parent;
    Node previous=null;
    Node next=null;
    Node down=null;
    public Node(int data)
    {
    	this.data=data;
    }
}

