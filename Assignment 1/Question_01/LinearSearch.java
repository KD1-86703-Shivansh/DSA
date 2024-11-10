package Question_01;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int arr[] = {12,54,23,45,66,89,72,54,23};
				
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Last index of key is : " + index);
		
		sc.close();

	}

	private static int linearSearch(int[] arr, int key) {
		int index = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(key == arr[i]) index = i;
		}
		if(index != 0) {
			return index;
		}else {
			return -1;
		}
	}
}
