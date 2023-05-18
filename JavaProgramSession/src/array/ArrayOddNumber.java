package array;

public class ArrayOddNumber {

	static void odd(int arr[]) {
		 int sum =0;
		 for(int i = 0;i< arr.length;i++) {
			 System.out.println(arr[i]);
			 if(arr[i]%2 != 0) {
				 sum = sum+arr[i]; 
			 }
		 }
		 System.out.println("Sum of Odd Number :"+sum);
	 }
	static void even(int arr[]) {
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
			System.out.println(arr[i]);
			sum = sum+arr[i];
		}
		}
		System.out.println("Sum of Even Number :"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int arr[] = {7,3,6,13,20}; 
		odd(arr);
		even(arr);
	}

}
