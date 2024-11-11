package com.sunbeam;

import java.util.Arrays;

public class StackMain {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,60,70,80,90,100};   // array
		
		Stack stack = new Stack(arr.length);   // stack obj
		
		System.out.println("Array before stack : "+ Arrays.toString(arr));
		
		// pushing data into stack
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		
		
		// reversing the array using stack
		for(int i=0;i<arr.length;i++) {
			arr[i] = stack.pop();
		}

		System.out.println("Array after stack : "+ Arrays.toString(arr));
	}

}
