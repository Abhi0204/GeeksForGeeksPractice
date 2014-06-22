package BinaryTree;

public class Ancestor {
 
	public boolean findAncestor(Node node,String path,int key)
	{
		
		if(node==null)
			return false;
		
		
		if(node.data==key)
		{
			System.out.println("Ancestors are "+path);
			return true;
		}
		
		else
		{
			
		path=path+node.data+" ";
		boolean flag= findAncestor(node.leftChild,path, key);
		if(flag==false)
		return findAncestor(node.rightChild,path, key);

		}
		return true;
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
		System.out.println(and.findAncestor(root,"",9));
	}

}
