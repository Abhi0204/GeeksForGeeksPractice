package BinaryTree;

public class PruneTreeLessthanSum {
	public Node prunTree(Node root, int sum, int k) {
		if (root == null)
			return null;
		sum = sum + root.data;
		if (root.leftChild == null && root.rightChild == null) {
			if (sum < k) {
				root = null;
				return null;
			}
			return root;
		}

		root.leftChild = prunTree(root.leftChild, sum, k);
		root.rightChild = prunTree(root.rightChild, sum, k);

		if (root.leftChild != null || root.rightChild != null)
			return root;

		return null;
	}
	
	public Node prunTreeNew(Node root, int sum, int k) {
		if(root==null)
		return null;
		
		sum=sum+root.data;
		if(sum>k)
			return null;
		
		root.leftChild=prunTreeNew(root.leftChild, sum, k);
		root.rightChild=prunTreeNew(root.rightChild, sum, k);
		
		return root;
		
		
	}

	public void inorder(Node node)
	{
		if (node==null)
			return;
		inorder(node.leftChild);
		System.out.print(node.data+" ");
		inorder(node.rightChild);
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
		
		
		PruneTreeLessthanSum prune=new PruneTreeLessthanSum();
		prune.inorder(root);
		root=prune.prunTreeNew(root,0, 8);
		System.out.println("\n");
		prune.inorder(root);
	}

}
