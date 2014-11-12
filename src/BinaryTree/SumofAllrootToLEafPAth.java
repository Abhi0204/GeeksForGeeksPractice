package BinaryTree;

public class SumofAllrootToLEafPAth {

	public int findSumRootToLeaf(Node root,int sum,String path)
	{


		if(root==null)
			return 0;

		path=path+root.data;
		if(root.leftChild==null && root.rightChild==null)
			return Integer.parseInt(path);

		int no=findSumRootToLeaf(root.leftChild,sum,path)+findSumRootToLeaf(root.rightChild,sum,path);

		return no;
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
		
		SumofAllrootToLEafPAth sum=new SumofAllrootToLEafPAth();
		System.out.println(sum.findSumRootToLeaf(root,0,""));
	}

}
