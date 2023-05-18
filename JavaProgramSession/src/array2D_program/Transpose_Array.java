package array2D_program;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose_Array {
	int arr[][] = new int[2][3];

	void addArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
	}

	void display() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	 void transpose() {
		int b[][] = new int[3][2]; 
		 for(int i =0;i<arr[0].length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 b[i][j]=arr[j][i]; 
				 System.out.print(b[i][j]+" ");
			 }
			 System.out.println();
		 }
		
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Transpose_Array obj = new Transpose_Array(); 
		  obj.addArray();
		  obj.display();
		  obj.transpose();
		 
		
//		String[] num =new String[] {"1","9","10"};
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
	}

}
