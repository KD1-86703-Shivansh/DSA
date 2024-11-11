package com.sunbeam;

public class CircularQueue {

	private int arr[];
	private int front, rear;
	private final int SIZE;
	public int count = 0;
	
	public CircularQueue(int size) {
		SIZE = size;
		front = rear = -1;
		arr = new int [SIZE];
	}
	
	public void push(int value) {
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		count++;
	}
	
	public int pop() {
		int temp = arr[(front + 1) % SIZE];
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
		count--;
		return temp;
	}
	
	public int peek() {
		return arr[(front + 1)% SIZE];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == SIZE;
	}
}
