package examsession4;

import java.util.Arrays;
import java.util.Scanner;

//WAP to find and count total number of duplicate elements in an array.

public class DuplicateElementArray {

	static void duplicate(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			boolean visited = false;
			int count = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;

					}
				}
				System.out.println(arr[i] + "---->" + count);
			}
		}
		System.out.println("Array element :"+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("Array element :");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		duplicate(arr);
	}

}
