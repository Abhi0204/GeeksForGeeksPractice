package BinaryTree;

public class CheckTreeisHieghtBalanced {

	public boolean hieghtBalancedCheck(Node root)
	{
		if(root==null)
			return true;
		
		int left=getHieght(root.leftChild);
		int right=getHieght(root.rightChild);
		
		if(Math.abs(left-right)<=1)
		{
			if(hieghtBalancedCheck(root.leftChild) && hieghtBalancedCheck(root.rightChild))
			                      return true;
			
		}
		return false;
		
	}
	
	public int getHieght(Node root)
	{
		if(root==null)
			return -1;
		return 1+Math.max(getHieght(root.leftChild), getHieght(root.rightChild));
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
		
		
		CheckTreeisHieghtBalanced check=new CheckTreeisHieghtBalanced();
		System.out.println(check.hieghtBalancedCheck(root));
	}

}
