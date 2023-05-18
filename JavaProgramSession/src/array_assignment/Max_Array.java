package array_assignment;

public class Max_Array {

	static void max(int arr[]) {
		
		int max= arr[0];
		for(int i =0;i<arr.length;i++) {
			System.out.println("A"+i+ " "+arr[i]);
			if(arr[i]>max) {
				max = arr[i];
				
			}
		}
		System.out.println("Max number of array is : "+max);
	}
	
	public static void main(String args[]) {
		int arr[]= {3,5,7,8,9};
		max(arr);
	}
}

//q1) Find out maximum number from given array
//int arr[]={3,5,7,8,9};
//o/p: 9
