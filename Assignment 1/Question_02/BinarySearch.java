package Question_02;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
				
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int comparision = binarySearch(arr, key);
		if(comparision == -1)
			System.out.println("Key is not found");
		else
			System.out.println("No. of comparision : " + comparision);
		
		sc.close();
	}

	private static int binarySearch(int[] arr, int key) {
		int left =0, right=arr.length-1 , comparison = 0, mid;
		while(left <= right) {
			mid = (left + right) / 2;
			++comparison;
			if(key == arr[mid]) {
				return comparison;
			}else if(key < arr[mid]){
				right = mid -1;
			}else {
				left = mid + 1;
			}
		}
		return -1;
	}

	
}