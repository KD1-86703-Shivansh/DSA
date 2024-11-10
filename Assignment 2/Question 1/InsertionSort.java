package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		insertionSort(arr, arr.length);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr, int length) {

		for(int i = length - 2 ; i >= 0; i--) { 
			
			int temp = arr[i];
			int j;
			
			for(j = i + 1 ; j < length && arr[j] > temp ; j++) {
				
				arr[j-1] = arr[j]; 
			}
			arr[j-1] = temp;
		}
	}
}
