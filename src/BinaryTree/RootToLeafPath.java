package BinaryTree;

public class RootToLeafPath {
	boolean flag = false;

	public void RootToLeafPath(Node node, String path) {
		if (node == null)
			return;
		path = path + node.data + "->";
		if (node.rightChild == null && node.leftChild == null)
			System.out.println(path);
		else
		{
		RootToLeafPath(node.leftChild, path);

		RootToLeafPath(node.rightChild, path);
		}
	}

	public void findRootToLEafPath(Node root,String path)
	{
	if(root==null){
	return;
	}

	if(root.leftChild==null && root.rightChild==null)
		System.out.println(path+" "+root.data);
	findRootToLEafPath(root.leftChild,path+" "+root.data);
	findRootToLEafPath(root.rightChild,path+" "+root.data);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.leftChild = new Node(2);
		root.leftChild.leftChild = new Node(3);
		root.leftChild.rightChild = new Node(4);
		root.rightChild = new Node(5);
		root.rightChild.leftChild = new Node(6);
		root.rightChild.leftChild.rightChild = new Node(9);
		root.rightChild.leftChild.leftChild = new Node(7);
		root.rightChild.rightChild = new Node(8);

		RootToLeafPath rtl = new RootToLeafPath();
		rtl.RootToLeafPath(root, "");
System.out.println("\n");
rtl.findRootToLEafPath(root,"");
	}

}
