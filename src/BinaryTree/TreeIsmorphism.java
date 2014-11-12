package BinaryTree;

public class TreeIsmorphism {

	public boolean isIsomorphic(Node root,Node root1)
	{
	if(root==null && root1==null)
	return true;

	if(root==null||root1==null)
	return false;

	if(root.data!=root1.data)
	return false;
	
	if(!isIsomorphic(root.leftChild,root1.leftChild))
		return isIsomorphic(root.leftChild,root1.rightChild) && isIsomorphic(root.rightChild,root1.leftChild);
			
		return isIsomorphic(root.rightChild,root1.rightChild);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Node root=new Node(1);
       root.leftChild=new Node(2);
       root.leftChild.leftChild=new Node(4);
       root.leftChild.rightChild=new Node(5);
       root.leftChild.rightChild.leftChild=new Node(7);
       root.leftChild.rightChild.rightChild=new Node(8);
       root.rightChild=new Node(3);
       
       root.rightChild.leftChild=new Node(6);
       
       
       Node root1=new Node(1);
       root1.rightChild=new Node(2);
       root1.rightChild.leftChild=new Node(4);
       root1.rightChild.rightChild=new Node(5);
       root1.rightChild.rightChild.leftChild=new Node(8);
       root1.rightChild.rightChild.rightChild=new Node(7);
       root1.leftChild=new Node(3);
       
       root1.leftChild.rightChild=new Node(6);
       
       
       TreeIsmorphism tree=new TreeIsmorphism();
       System.out.println(tree.isIsomorphic(root, root1));
       
	}

}
