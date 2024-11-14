package com.sunbeam.p1;

public class QueueMain {

	public static void main(String[] args) {

		LinearLinkedList q = new LinearLinkedList();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		q.dequeue();
		
		q.peek();
		
		q.display();
	}

}
