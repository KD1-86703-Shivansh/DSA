package com.sunbeam;

import java.util.Scanner;

public class LinkedListMain {
	
	static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Add Before");
		System.out.println("2. Add After");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList l1 = new LinkedList();
		
		l1.addFirst(50);
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		
		l1.display();
		
		int choice;
		
		while((choice = menu(sc)) != 0) {
			
			int data;
			int value;
			int pos;
			
			switch (choice) {
			case 1:
				System.out.print("Enter value you want to add : ");
				data = sc.nextInt();
				System.out.print("Enter the value before you want to add : ");
				value = sc.nextInt();
				pos = l1.findPosition(value);
				l1.addPosition(data, pos);
				l1.display();
				break;
			case 2:
				System.out.print("Enter value you want to add : ");
				data = sc.nextInt();
				System.out.print("Enter the value after you want to add : ");
				value = sc.nextInt();
				pos = l1.findPosition(value);
				l1.addAfterPosition(data, pos);
				l1.display();
				break;

			default:
				System.out.println("Wrong choice!!!");
				l1.display();
				break;
			}
		}
		
	}

}
