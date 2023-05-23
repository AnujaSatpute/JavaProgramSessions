package array_assignment;

import java.util.Scanner;

public class Rainfall_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float sum = 0.0f;
		float arr[] = new float[7];
		System.out.println("Enter Rainfall days :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
		}
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum : " + sum);
		float avg = sum / 7;
		System.out.println("Average rainfall : " + avg);

	}

}
