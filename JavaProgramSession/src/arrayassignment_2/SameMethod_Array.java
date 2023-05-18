package arrayassignment_2;

import java.util.Arrays;

//7. Write two methods that return the average of an array with
/*following headers.
a. public static int average(int[] array)
b. public static double average(double[] array).
c. Use {1,2,3,4,5,6} , {6.0,3.4,6.4,1.2,4.0} to test the methods */
public class SameMethod_Array {
	public static int average(int[] array) {
		
			int sum = 0;
			int avg;
			for (int i = 0; i < array.length; i++) {
			
				sum = sum + array[i];
			}
			avg = sum / array.length;
		
		return avg;
		
	}
	public static double average(double[] array) {
		double sum = 0.0;
		double avg;
		for (int i = 0; i < array.length; i++) {
			
			sum = sum + array[i];
		}
		avg = sum / array.length;
	
	return avg;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5,6};
double arr1[] = {6.0,3.4,6.4,1.2,4.0};
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(arr1));
System.out.println("Average of integer array :"+average(arr));
System.out.println("Average of double array :"+average(arr1));

	}

}
