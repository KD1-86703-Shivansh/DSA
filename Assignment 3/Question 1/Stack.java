package com.sunbeam;

public class Stack {

	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size) {
		SIZE = size;
		top = -1;
		arr = new int[SIZE];
	}
	
	public void push(int value) {
		top++;
		arr[top] = value;
	}
	
	public int pop() {
		int temp = arr[top];
		top--;
		return temp;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE - 1;
	}
}
