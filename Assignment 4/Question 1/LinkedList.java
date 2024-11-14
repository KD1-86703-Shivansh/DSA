package com.sunbeam;

public class LinkedList {

	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	private int size;
	
	public LinkedList() {
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public int size() {
		return size;
	}
	
	
	/***********************************************************************************/
	
	public void addFirst(int value) {
		// create node 
		Node newnode = new Node(value);
		// if list is empty
		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;  // make list circular  
		}else {
			// add tail into next of newnode
			newnode.next = tail.next;
			tail.next = newnode;
		}
		size++;
	}
	
	public void addLast(int value) {
		// create node 
		Node newnode = new Node(value);
		if(isEmpty()) {
			addFirst(value);
			return;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = tail.next;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		// create new node
		Node newnode = new Node(value);
		// validate position
		if(pos<=1) {
			addFirst(value);
			return;
		}else if(pos>= size+1) {
			addLast(value);
			return;
		}else {
			// create trav to traverse to the position node
			Node trav = tail.next;
			// traverse to pos - 1
			for(int i=0;i<pos-1;i++) {
				trav = trav.next;
			}
			// add trav.next to the next of newnode 
			newnode.next = trav.next;
			// add newnode to the next of trav 
			trav.next = newnode;
		}
		size++;
	}
	
	/***********************************************************************************/
	
	public void deleteFirst() {
		// is list is empty
		if(isEmpty()) return;
		// if list has single node 
		else if(size == 1) tail = null;
		// If list has multiple nodes
		else {
			// add second node to the next of last node  
			tail.next = tail.next.next;
		}
		size--;
	}
	
	public void deleteLast() {
		// traverse to the second last node of the list
		Node trav = tail.next;
		if(isEmpty()) return;
		else if(size == 1) {
			deleteFirst();
			return;
		}else {
			while(trav.next != tail) {
				trav = trav.next;
			}
		}
		tail = trav;
		tail.next = tail.next.next;
		size--;
	}
	
	public void deletePosition(int pos) {
		// validate position
		if(pos<=1) {
			deleteFirst();
			return;
		}else if(pos>= size+1) {
			deleteLast();
			return;
		}else {
			// create trav to traverse to the position node
			Node trav = tail.next;
			// traverse to pos - 1
			for(int i=0;i<pos-1;i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
		size--;
	}
	
	/***********************************************************************************/
	
	public void display() {
		Node trav = tail;
		System.out.print("List : ");
		do {
			System.out.print(trav.next.data+" ");
			trav = trav.next;
		}while(trav != tail);
		System.out.println();
		System.out.println("Size : "+ size);
	}
}
