package examsession4;

import java.util.Scanner;

//Q10)	WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], 
//so min character is ‘A’.
public class MinChracter_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[] = { 'A', 'D', 'E', 'x', 'z', 'R' };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		char min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum character :" + min);

	}

}
