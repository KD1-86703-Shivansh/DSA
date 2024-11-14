package com.sunbeam;

import java.util.Scanner;

public class StackMain {
	
	static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Display Stack");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		LinkedList stack = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			choice = menu(sc);
			
			switch (choice) {
			case 0:
				System.out.println("Thankyou...");
				break;
			case 1:
				System.out.print("Enter data : ");
				int data = sc.nextInt();
				stack.push(data);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.display();
				break;
			default:
				System.out.println("Wrong choice!!!");
				break;
			}
			
		}while(choice != 0);
	}

}
