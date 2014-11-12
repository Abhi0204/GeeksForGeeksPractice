package BinaryTree;

public class Diameter {

	public int getLength(Node root)
	{ 
		if (root==null)
			return 0;
		
		int leftHieght=getHieght(root.leftChild);
		int rightHieght=getHieght(root.rightChild);
		
		int getLengthLeft=getLength(root.leftChild);
		int getLengthRight=getLength(root.rightChild);
		
		return (Math.max(1+leftHieght+rightHieght,Math.max(getLengthLeft, getLengthRight)));		
		
	}
	
	
	public int getHieght(Node node)
	{
		if(node==null)
			return 0;
		return 1+ Math.max(getHieght(node.leftChild),getHieght(node.rightChild));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.leftChild = new Node(2);
		root.leftChild.leftChild = new Node(3);
		root.leftChild.rightChild = new Node(4);
		root.rightChild = new Node(5);
		root.rightChild.rightChild= new Node(8);
		root.rightChild.leftChild = new Node(6);
		root.rightChild.leftChild.rightChild = new Node(9);
		root.rightChild.leftChild.leftChild = new Node(7);
		/*root.rightChild.leftChild.leftChild.leftChild = new Node(8);
		root.rightChild.leftChild.leftChild.leftChild .leftChild= new Node(8);
		root.rightChild.leftChild.leftChild.leftChild.leftChild.leftChild = new Node(8);
		root.rightChild.leftChild.leftChild.leftChild.leftChild .leftChild.leftChild= new Node(8);
		root.rightChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild = new Node(8);
		root.rightChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild = new Node(8);
		root.rightChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild = new Node(8);
		root.rightChild.leftChild.rightChild .rightChild= new Node(9);
		root.rightChild.leftChild.rightChild .rightChild.rightChild= new Node(9);
		root.rightChild.leftChild.rightChild.rightChild.rightChild.rightChild= new Node(9);
		root.rightChild.leftChild.rightChild .rightChild.rightChild.rightChild.rightChild= new Node(9);
		root.rightChild.leftChild.rightChild .rightChild.rightChild.rightChild.rightChild.rightChild= new Node(9);
		root.rightChild.leftChild.rightChild.rightChild.rightChild.rightChild.rightChild.rightChild.rightChild = new Node(9);*/
		Diameter d=new Diameter();
		
		System.out.println(d.getLength(root));
		
	}

}
