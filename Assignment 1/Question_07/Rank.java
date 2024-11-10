package Question_07;

import java.util.Scanner;

public class Rank {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr [] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.print("Enter Element : ");
		int ele = sc.nextInt();
		
		int rank = checkRank(arr , ele);
		System.out.println("Rank : "+ rank);
	}

	private static int checkRank(int[] arr, int ele) {
		int rank=0;
		for(int i: arr) {
			if(i<= ele) rank++;
		}
		return rank;
	}

}
