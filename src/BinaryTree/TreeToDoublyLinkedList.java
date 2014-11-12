package BinaryTree;

public class TreeToDoublyLinkedList {

	public void convertToDoublyLinkedListInorder(Node root, Node[] current,
			Node[] head) {

		if (root == null)
			return;

		convertToDoublyLinkedListInorder(root.leftChild, current, head);

		Node temp = root.rightChild;
		if (head[0] == null)
			head[0] = root;
		else {
			current[0].rightChild = root;
			root.leftChild = current[0];

		}
		current[0] = root;
		convertToDoublyLinkedListInorder(temp, current, head);

	}
	public void convertToDoublyLinkedListPreorder(Node root, Node[] current,
			Node[] head) {

		if (root == null)
			return;
		Node left = root.leftChild;
		Node right = root.rightChild;
		if (head[0] == null)
			head[0] = root;
		else {
			current[0].rightChild = root;
			root.leftChild = current[0];

		}
		current[0] = root;

		convertToDoublyLinkedListPreorder(left, current, head);

		convertToDoublyLinkedListPreorder(right, current, head);

	}

	public void convertToDoublyLinkedListPostOrder(Node root, Node[] current,
			Node[] head) {

		if (root == null)
			return;

		convertToDoublyLinkedListPostOrder(root.leftChild, current, head);
		convertToDoublyLinkedListPostOrder(root.rightChild, current, head);

		if (head[0] == null)
			head[0] = root;
		else {
			current[0].rightChild = root;
			root.leftChild = current[0];

		}
		current[0] = root;
		root.rightChild = null;

	}

	public void traverseDoublyLinkedList(Node root) {
		Node curr = root;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.rightChild;
		}
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

		Node[] curr = new Node[1];
		Node[] head = new Node[1];

		TreeToDoublyLinkedList tree = new TreeToDoublyLinkedList();
		tree.convertToDoublyLinkedListPostOrder(root, curr, head);
		tree.traverseDoublyLinkedList(head[0]);
	}

}
