package Question_06;

public class FirstNonRepeating {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } ;
		
		int ele = check(arr);
		if(ele == -1) System.out.println("No non-repeating element present in the array!");
		else System.out.println("Non repeating element : "+ ele);
	}

	private static int check(int[] arr) {

		for(int i=0;i<arr.length-1;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count==1) return arr[i];
		}
		return -1;
	}

}
