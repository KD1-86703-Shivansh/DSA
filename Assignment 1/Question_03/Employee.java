package Question_03;

import java.util.Scanner;

public class Employee {
	
	public int empid;
	public String name;
	
	

	// ctors
	public Employee() {
	}

	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Employee [empid=" + empid + ", name=" + name + "]");
	}

	
	
	
	// getters
	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}
	
	
	
	// find By Id 
	public static Employee findById(Employee arr[] , Scanner sc) {
		System.out.print("Enter id to search : ");
		int id = sc.nextInt();
		for(Employee e : arr) {
			if(id == e.getEmpid()) return e;
		}
		return null;
	}
	
	// find By Name
	public static Employee findByName(Employee arr[], Scanner sc) {
		System.out.print("Enter name to search : ");
		String name = sc.next();
		for(Employee e : arr) {
			if(name.equals(e.getName())) return e;
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Employee arr [] = {
				(new Employee(1, "Shivansh")),
				(new Employee(2, "Harsh")),
				(new Employee(3, "Shivam")),
				(new Employee(4, "Chetna")),
				(new Employee(5, "Rohan")),
		};
		
		
		System.out.println("1. Serach by id: ");
		System.out.println("2. Serach by name: ");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		Employee e ;
		switch (choice) {
		case 1:
			e = findById(arr, sc);
			if(e == null) {
				System.out.println("Employee not found ");
			}
			else e.display();
			break;
		case 2:
			e = findByName(arr, sc);
			if(e == null) {
				System.out.println("Employee not found ");
			}
			else e.display();
			break;

		default:
			System.out.println("Wrong choice!!!");
			break;
		}
		

	}
}
