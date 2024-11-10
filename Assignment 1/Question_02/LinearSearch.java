package Question_02;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int arr[] = {12,54,23,45,66,89,72,54,23};
				
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int comparision = linearSearch(arr, key);
		if(comparision == -1)
			System.out.println("Key is not found");
		else
			System.out.println("No. of comparision : " + comparision);
		
		sc.close();
	}

	private static int linearSearch(int[] arr, int key) {
		int comparision = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			++comparision;
			if(key == arr[i]) return comparision;
		}
		
		return -1;
	}
}
