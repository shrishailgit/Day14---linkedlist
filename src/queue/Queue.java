package queue;

import java.util.LinkedList;

public class Queue<L> {
	LinkedList list=new LinkedList();

	public void enqueue(L data) {
		list.addFirst(data);
	}

	public void dequeue()
	{
		list.pollLast();
	}

	public void getElements()
	{
		list.println();
	}
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(56);
		queue.getElements();
		queue.enqueue(30);
		queue.getElements();
		queue.enqueue(70);
		queue.getElements();
		queue.dequeue();
		queue.getElements();
		queue.dequeue();
		queue.getElements();
		queue.dequeue();
		queue.getElements();
	}
}