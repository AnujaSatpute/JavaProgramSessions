package array;

import java.util.Arrays;

public class Array_Reverse {

	void reverseArray(int arr[]) {
		int mid = arr.length/2;
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i<mid;i++) {
			int temp = arr[i];
			arr[i] = arr[mid+i];
			arr[mid+i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Array_Reverse obj = new Array_Reverse();
		obj.reverseArray(arr);
	}

}
