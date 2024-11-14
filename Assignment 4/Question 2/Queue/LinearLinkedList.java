package com.sunbeam.p1;

public class LinearLinkedList {

	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node front , rear;
	private int size;
	
	public LinearLinkedList() {
		front = rear = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			front = rear = newnode;
		}else {
			rear.next = newnode;
			rear = newnode;
		}
		size++;
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!!!");
			return;
		}  // if queue has one element
		else {
			System.out.println("Dequeue data : "+ front.data);
			front = front.next;
		}
		size--;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}else {
			System.out.println("Data at front : "+ front.data);
		}
	}
	
	public void display() {
		Node trav = front;
		System.out.print("Queue : ");
		while(trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
		System.out.println("Size : "+ size);
	}
	
}





















