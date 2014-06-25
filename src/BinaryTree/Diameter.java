package BinaryTree;

public class Diameter {

	public void getLength(Node root,int count)
	{ 
		if (root==null)
			return;
		
		if(root.leftChild==null && root.rightChild==null)
			System.out.println(count);
		else
		{
		getLength(root.leftChild, count+1);
		getLength(root.rightChild, count+1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		//root.leftChild = new Node(2);
		/*root.leftChild.leftChild = new Node(3);
		root.leftChild.rightChild = new Node(4);*/
		root.rightChild = new Node(5);
		//root.rightChild.rightChild= new Node(15);
		root.rightChild.leftChild = new Node(6);
		//root.rightChild.leftChild.rightChild = new Node(9);
		root.rightChild.leftChild.leftChild = new Node(8);
		
		Diameter d=new Diameter();
		d.getLength(root,1);
	}

}
