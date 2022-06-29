package linkedlist3;

public class MyLinkedList3<L> {
	Node<L> head;

	public boolean addFirst(L data) {

		@SuppressWarnings("unchecked")
		Node<L> newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}

		Node<L> temp = head;
		newNode.next = temp;
		head = newNode;

		return true;
	}
	public void print() {

		if (head == null) {
			System.out.println("No elements to show...");
			return;
		}

		Node temp = head;
		if (head.next == null) {
			System.out.println(head.data);
			return;
		}
		while (temp != null) {

			if (temp.next != null)
				System.out.print(temp.data + " ===> ");
			else
				System.out.println(temp.data);

			temp = temp.next;
		}
	}
	public class Node<L> {
		L data;
		Node<L> next;

		Node(L data) {
			this.data = data;
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		MyLinkedList3 linkedlist = new MyLinkedList3();
		linkedlist.addFirst(70);
		linkedlist.print();
		linkedlist.addFirst(30);
		linkedlist.print();
		linkedlist.addFirst(56);
		linkedlist.print();
	}
}
