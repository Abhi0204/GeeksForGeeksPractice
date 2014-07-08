package BinaryTree;

public class KDistance {

	public void getDistance(Node root,Node givenNode,int k)
	{
		if(givenNode==null)
			return;
		
		if(k==0)
		{
			System.out.print(givenNode.data+" ");
		    return;
		}
		getDistance(root,givenNode.leftChild,k-1);
		getDistance(root,givenNode.rightChild,k-1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(20);
		root.leftChild=new Node(8);
		root.leftChild.leftChild=new Node(4);
		root.leftChild.rightChild=new Node(12);
		root.leftChild.rightChild.leftChild=new Node(10);
		root.leftChild.rightChild.rightChild=new Node(14);
		root.rightChild=new Node(22);
		/*root.rightChild.leftChild=new Node(6);
		root.rightChild.leftChild.rightChild=new Node(9);
		root.rightChild.leftChild.leftChild=new Node(7);
		root.rightChild.rightChild=new Node(8);*/
		
		
		KDistance kk=new KDistance();
		kk.getDistance(root,root.leftChild,2);
	}

}
