package BinarySearchTree;

public class InorderSuccessor {

	public static Node root=null;
	
	public Node insertBSt(Node root,Node node)
	{
		if(root==null)
		{
			node.leftChild=null;
		    node.rightChild=null;
            return node;
		}
		
		if(node.data>root.data)
			root.rightChild=insertBSt(root.rightChild,node);
		else if(node.data<root.data)
			root.leftChild=insertBSt(root.leftChild,node);
			
            return root;
		
	}
	
	public int FindInorderSuccessor(Node rootNode,Node node)
	{
		if(rootNode==null)
			return 0;
		Node succ=null;
		while(rootNode!=null)
		{
			if(node.data<rootNode.data)
			{
				succ=rootNode;
				rootNode=rootNode.leftChild;
			}
			else if(node.data>rootNode.data)
				rootNode=rootNode.rightChild;
			else if(node.data==rootNode.data)
				break;
		}
		
		return succ.data;
	}
	
	public int findMin(Node node,int min)
	{
		
	if(node==null)
		return min;
	if(min>node.data)
		min=node.data;
	int minimum=findMin(node.leftChild, min);
	findMin(node.rightChild, minimum);
    
	return minimum;
	
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
		Node tenth=new Node(90);
		Node eleven=new Node(88);
		
		InorderSuccessor insert=new InorderSuccessor();
		
		root=first;
		insert.insertBSt(root,second);

		insert.insertBSt(root,third);
		insert.insertBSt(root,fourth);
		insert.insertBSt(root,fifth);
		insert.insertBSt(root,sixth);
		insert.insertBSt(root,seventh);
		insert.insertBSt(root,eight);
		insert.insertBSt(root,ninth);
		insert.insertBSt(root,tenth);
		insert.insertBSt(root,eleven);
		
		System.out.println(insert.FindInorderSuccessor(root,fourth));

		System.out.println(insert.findMin(sixth, sixth.data));
	}

}
