package BinaryTree;

public class MAximumSumPathinAtree {

	
	public int findMAximumSumPath(Node node)
	{
		if(node==null)
			return 0;
		if(node.leftChild==null && node.rightChild==null)
			return node.data;
		
		return node.data+Math.max(findMAximumSumPath(node.leftChild),findMAximumSumPath(node.rightChild));
		
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
		
		MAximumSumPathinAtree maximum=new MAximumSumPathinAtree();
		System.out.println(maximum.findMAximumSumPath(root));
	}

}
