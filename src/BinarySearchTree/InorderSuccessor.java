package BinarySearchTree;

public class InorderSuccessor {

	public static Node root = null;

	public Node insertBSt(Node root, Node node) {
		if (root == null) {
			node.leftChild = null;
			node.rightChild = null;
			return node;
		}

		if (node.data > root.data)
			root.rightChild = insertBSt(root.rightChild, node);
		else if (node.data < root.data)
			root.leftChild = insertBSt(root.leftChild, node);

		return root;

	}

	public Node findMin(Node root) {
		if (root == null)
			return null;

		while (root.leftChild != null)
			root = root.leftChild;
		return root;
	}

	public Node FindInorderSuccessor(Node rootNode, Node node) {
		if (rootNode == null)
			return null;

		if (node.rightChild != null)
			return findMin(node.rightChild);

		Node succ = null;
		while (rootNode != null) {
			if (node.data < rootNode.data) {
				succ = rootNode;
				rootNode = rootNode.leftChild;
			} else if (node.data > rootNode.data)
				rootNode = rootNode.rightChild;
			else if (node.data == rootNode.data)
				break;
		}

		return succ;
	}
	public Node FindInorderPred(Node rootNode, Node node) {
		if (rootNode == null)
			return null;

		if (node.rightChild != null)
			return findMin(node.rightChild);

		Node succ = null;
		while (rootNode != null) {
			if (node.data < rootNode.data) {
				succ = rootNode;
				rootNode = rootNode.leftChild;
			} else if (node.data > rootNode.data)
				rootNode = rootNode.rightChild;
			else if (node.data == rootNode.data)
				break;
		}

		return succ;
	}

	public void findPredSucc(Node root, int key, int[] pred, int[] succ) {
		if (root == null)
			return;

		if (root.data == key) {
			if (root.rightChild != null) {
				Node temp = root.rightChild;
				succ[0]=temp.data;
				while (temp.leftChild != null)

				{
					succ[0] = temp.data;
					temp = temp.leftChild;
				}

			}

			if (root.leftChild != null) {
				Node temp = root.leftChild;
				pred[0]=temp.data;
				while (temp.rightChild != null)

				{
					pred[0] = temp.data;
					temp = temp.rightChild;
				}

			}
			
			return;
		}

		if (root.data > key) {
			succ[0] = root.data;
			findPredSucc(root.leftChild, key, pred, succ);

		} else {
			pred[0] = root.data;
			findPredSucc(root.rightChild, key, pred, succ);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first = new Node(100);
		Node second = new Node(120);
		Node third = new Node(140);
		Node fourth = new Node(70);
		Node fifth = new Node(60);
		Node sixth = new Node(80);
		Node seventh = new Node(110);
		Node eight = new Node(50);
		Node ninth = new Node(40);
		Node tenth = new Node(90);
		Node eleven = new Node(88);

		InorderSuccessor insert = new InorderSuccessor();

		root = first;
		insert.insertBSt(root, second);

		insert.insertBSt(root, third);
		insert.insertBSt(root, fourth);
		insert.insertBSt(root, fifth);
		insert.insertBSt(root, sixth);
		insert.insertBSt(root, seventh);
		insert.insertBSt(root, eight);
		insert.insertBSt(root, ninth);
		insert.insertBSt(root, tenth);
		insert.insertBSt(root, eleven);

		System.out.println(insert.FindInorderSuccessor(root, eleven).data);
		insert.findMin(second);
		System.out.println("\n");
int[] pred=new int[1];
int[]succ=new int[1];

pred[0]=0;
succ[0]=0;
insert.findPredSucc(root, 110, pred, succ);
System.out.println(pred[0]);
System.out.println(succ[0]);
	}

}
