package BinaryTree;

public class DoublyLinkedListOfLeaves {

	public Node makeLinkedList(Node root, Node head, Node[] arr) {

		if (root == null)
			return null;
		if (root.leftChild == null && root.rightChild == null) {
			if (head == null)
				arr[0] = root;
			else {
				root.previous = head;
				head.next = root;
			}
			head = root;
			return head;

		}

		Node node = makeLinkedList(root.leftChild, head, arr);
		return makeLinkedList(root.rightChild, node, arr);

	}

	public Node ExtractLinkedList(Node root, Node[] current, Node[] head) {

		if (root == null)
			return null;
		if (root.leftChild == null && root.rightChild == null) {
			if (current[0] == null) {
				head[0] = root;
				current[0] = root;
			} else {
				current[0].rightChild = root;
				root.leftChild = current[0];
				current[0] = root;

			}
			root = null;
			return null;
		}
		root.leftChild = ExtractLinkedList(root.leftChild, current, head);
		root.rightChild = ExtractLinkedList(root.rightChild, current, head);

		return root;

	}

	public void traverseLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.rightChild;
		}

	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.leftChild);
		System.out.print(root.data + " ");
		inorder(root.rightChild);
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

		DoublyLinkedListOfLeaves doubly = new DoublyLinkedListOfLeaves();
		Node[] arr = new Node[1];
		Node[] head = new Node[1];
		// doubly.makeLinkedList(root, null, arr);
		// doubly.traverseLinkedList(arr[0]);
		doubly.inorder(root);
		doubly.ExtractLinkedList(root, head, arr);
		System.out.println("\n");
		doubly.inorder(root);
		System.out.println("\n");
		doubly.traverseLinkedList(arr[0]);
	}

}
