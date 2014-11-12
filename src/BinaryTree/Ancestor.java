package BinaryTree;

public class Ancestor {
 
	public void getAncestors(Node root,String path,int number)
	{
	if(root==null)
	return;

	if(root.data==number){
	System.out.println(path);
	return;
	}

	getAncestors(root.leftChild,path+" "+root.data,number);
	getAncestors(root.rightChild,path+" "+root.data,number);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.leftChild=new Node(2);
		root.leftChild.leftChild=new Node(3);
		root.leftChild.rightChild=new Node(4);
		root.rightChild=new Node(5);
		root.rightChild.leftChild=new Node(6);
		root.rightChild.leftChild.rightChild=new Node(9);
		root.rightChild.leftChild.leftChild=new Node(7);
		root.rightChild.rightChild=new Node(8);
		
		Ancestor and=new Ancestor();
		and.getAncestors(root,"",4);
	}

}
