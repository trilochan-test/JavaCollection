package listConcept;

public class MyLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public void printMyLinkedList() {
		Node n = head;

		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public static void main(String[] args) {

		MyLinkedList mll = new MyLinkedList();
		Node firstNode = mll.new Node(10);
		mll.head = firstNode;

		Node secondNode = mll.new Node(20);
		firstNode.next = secondNode;

		Node thirdNode = mll.new Node(30);
		secondNode.next = thirdNode;

		mll.printMyLinkedList();
	}
}
