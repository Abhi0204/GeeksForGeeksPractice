package BinarySearchTree;

public class Deletion {
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

	public void inorder(Node node) {
		if (node == null)
			return;
		inorder(node.leftChild);
		System.out.print(node.data + " ");
		inorder(node.rightChild);
	}

	public Node deleteNode(Node root, Node node, Node rootHead) {
		if (root == null)
			return null;

		if (root.data > node.data)
			root.leftChild = deleteNode(root.leftChild, node, rootHead);
		else if (root.data < node.data)
			root.rightChild = deleteNode(root.rightChild, node, rootHead);
		else {
			Node temp = null;
			if (root.leftChild == null) {
				temp = root.rightChild;
				root = null;
				return temp;
			} else if (root.rightChild == null) {
				temp = root.leftChild;
				root = null;
				return temp;
			}

			Node succ = findMin(node.rightChild);
			root.data = succ.data;
			root.rightChild = deleteNode(root.rightChild, succ, rootHead);
		}

		return root;
	}

	public Node getInorderSuccessor(Node node, Node root) {
		if (node.rightChild != null)
			return findMin(node.rightChild);

		else {
			Node current = root;
			Node succ = null;
			while (current != null) {
				if (node.data < current.data) {
					succ = root;
					current = current.leftChild;
				} else if (node.data > current.data)
					current = current.rightChild;

				else
					break;

			}
			return succ;
		}
	}
	public Node findMin(Node node) {
		Node current = node;
		Node prev = null;
		while (current != null) {

			prev = current;
			current = current.leftChild;
		}

		return prev;
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
		 Node ninth=new Node(40);
		Node tenth = new Node(55);
		Node eleven = new Node(58);
		Node twel = new Node(54);

		Deletion insert = new Deletion();

		root = first;
		insert.insertBSt(root, second);

		insert.insertBSt(root, third);
		insert.insertBSt(root, fourth);
		insert.insertBSt(root, fifth);
		insert.insertBSt(root, sixth);
		insert.insertBSt(root, seventh);
		insert.insertBSt(root, eight);
		insert.insertBSt(root,ninth);
		insert.insertBSt(root, tenth);
		insert.insertBSt(root, eleven);
		insert.insertBSt(root, twel);

		insert.inorder(root);
		Node temp = insert.deleteNode(root, second, root);
		System.out.println("\n");
		insert.inorder(temp);

	}

}
