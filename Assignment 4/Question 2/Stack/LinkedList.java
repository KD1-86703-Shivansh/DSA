package com.sunbeam;

// Stack implementation using doubly linear linked list

public class LinkedList {

	static class Node{
		private int data;
		private Node next, prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	/******************************************************************************/
	
	public void push(int value) {
		//1. create node
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			head = newnode;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into prev of first node
			head.prev = newnode;
			//c. move head on newnode
			head = newnode;
		}
		size++;
		System.out.println("Data pushed successfully...");
	}
	
	public void pop() {
		// check if list is empty
		if(isEmpty()) {
			System.out.println("Stack is empty!!!");
			return;
		}
		// is stack has only one element
		else if(size == 1) {
			System.out.println("Popped data : "+ head.data);
			head = null;
		}
		// if stack has multiple elements
		else {
			System.out.println("Popped data : "+ head.data);
			// move head to second node
			head = head.next;
			// from second node make next of first node's next null
			head.prev.next = null;
			// make head prev equal to null
			head.prev = null;
		}
		size--;
	}
	
	public void peek() {
		// check if list is empty
		if(isEmpty()) {
			System.out.println("Stack is empty!!!");
			return;
		}else {
			System.out.println("Peek : "+ head.data);
		}
	}
	
	
	public void display() {
		Node trav = head;
		System.out.print("Stack : ");
		if(isEmpty()) {
			System.out.println("Stack is empty!!!");
			return;
		}else {
			while(trav != null) {
				System.out.print(" "+ trav.data);
				trav = trav.next;
			}
		}
		System.out.println();
	}
	
	
	
}


























































