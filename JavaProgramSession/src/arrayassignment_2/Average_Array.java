package arrayassignment_2;

import java.util.Arrays;

public class Average_Array {

	void average(int arr[]) {
		int sum = 0;
		int avg;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of Arrays :" + sum);
		System.out.println("Average of arrays :" + avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 60 };
		Average_Array obj = new Average_Array();
		obj.average(arr);
	}

}
