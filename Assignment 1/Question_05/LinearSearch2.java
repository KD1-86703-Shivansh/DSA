package Question_05;

import java.util.Scanner;

public class LinearSearch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int arr[] = {12,54,23,45,66,89,72,54,23,54,66};
				
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		System.out.print("Enter nth occurance of the key you want to search : ");
		int occurance = sc.nextInt();
		
		boolean flag = isPresent(key, occurance, arr);
		
		if(flag) {
			int index = checkIndex(arr,key,occurance);
			System.out.println("Key "+ key );
			System.out.println("Occurance of the key "+ occurance );
			System.out.println("Index of key "+ index );
		}else {
			System.out.println("Key is not present, equal to or more than the occurance specified!!!");
		}
		
		sc.close();

	}


	private static int checkIndex(int[] arr, int key, int occurance) {
		int count = 0;
		for(int i = 0 ; i< arr.length ; i++) {
			if(arr[i] == key) count++;
			if(arr[i] == key && count == occurance) return i;
		}
		return 0;
	}


	private static boolean isPresent(int key, int occurance, int[] arr) {
		int count = 0;
		for(int i : arr) {
			if(key == i) count++;
		}
		if(count >= occurance ) return true;
		return false;
	}

}
