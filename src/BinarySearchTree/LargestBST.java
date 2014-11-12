package BinarySearchTree;

public class LargestBST {

	/**
	 * @param args
	 */
	
	public static Node root;
	public void insertBT(Node rootHead,Node node)
	{
	  if(root==null)
	  {  root=node;
	  return;
	  }
	  
	  Node current=root;
	  while(current!=null)
	  {
		  if(current.leftChild==null){
			  current.leftChild=node;
			  break;
		  }
		  else if(current.rightChild==null){
			  current.rightChild=node;
			  break;
		  }
		  else
			  current=current.leftChild;
	  }
	  
	}
	
	public void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.leftChild);
		System.out.print(root.data+" ");
		inorder(root.rightChild);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=new Node(100);
		Node second=new Node(120);
		Node third=new Node(140);
		Node fourth=new Node(70);
		Node fifth=new Node(60);
		Node sixth=new Node(80);
		Node seventh=new Node(110);
		Node eight=new Node(50);
		Node ninth=new Node(40);
		Node tenth=new Node(55);
		Node eleven=new Node(58);
		Node twel=new Node(54);
		
		LargestBST largest=new LargestBST();
		largest.insertBT(root,first);
		largest.insertBT(root,second);
		largest.insertBT(root,third);
		largest.insertBT(root,fourth);
		largest.insertBT(root,fifth);
		largest.insertBT(root,sixth);
		largest.insertBT(root,seventh);
		largest.insertBT(root,eight);
		largest.insertBT(root,ninth);
		largest.insertBT(root,tenth);
		largest.insertBT(root,eleven);
		largest.insertBT(root,twel);
		
		largest.inorder(root);
	}

}
