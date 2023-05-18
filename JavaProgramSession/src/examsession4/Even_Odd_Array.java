package examsession4;
//	WAP to put even and odd elements of array in two separate arrays.

import java.util.Scanner;

public class Even_Odd_Array {

	void evenOdd(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		
       int arr[] = new int[size];
       for(int i = 0;i<arr.length;i++) {
    	   arr[i]=sc.nextInt();
       }
       Even_Odd_Array e1 = new Even_Odd_Array();
       e1.evenOdd(arr);
       
	}

}
