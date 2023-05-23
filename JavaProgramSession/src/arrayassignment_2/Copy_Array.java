package arrayassignment_2;

import java.util.Arrays;

//WAJP2 copy an array by iterating the array. 
public class Copy_Array {

	static void copy(int arr[]) {
		int arr1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 55, 62, 78, 96 };
		copy(arr);
	}

}
