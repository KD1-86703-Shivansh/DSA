package com.sunbeam;

public class Employee {
	
	public int empid;
	public String name;
	public double salary;
	
	// ctor
	
	public Employee() {
		super();
	}
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
	public String display() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	private static void sortBySalary(Employee[] arr, int length) {
		
		// sorting using Selection Sort
		
		for(int i=0;i<length-1;i++) {
			
			for(int j=i+1;j<length;j++) {
				
				if(arr[j].getSalary() < arr[i].getSalary()) {
					Employee e = arr[i];
					arr[i] = arr[j];
					arr[j] = e;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		
		Employee arr [] = {
				(new Employee(5, "Chetna", 20000)),
				(new Employee(3, "Harsh", 40000)),
				(new Employee(4, "Rohan", 10000)),
				(new Employee(1, "Shivansh", 50000)),
				(new Employee(2, "Shivam", 30000)),
		};
		System.out.println("Before sorting...");
		for(Employee e : arr)
			System.out.println(e.display());
		
		sortBySalary(arr , arr.length);
		
		System.out.println("After sorting...");
		for(Employee e : arr)
			System.out.println(e.display());
	}



}
