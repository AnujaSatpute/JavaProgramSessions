package examsession5;
//2.	WAJP2 find sum of lower triangular matrix.
import java.util.Scanner;

public class SumOfLowerMatrix {
	int arr[][] = new int[3][3];

	void addArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array elements:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
	}

	void display() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	void sumOfLowerTriangular() {
		int sum = 0;
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i > j) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("Sum of lower triangular elements :" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfLowerMatrix obj = new SumOfLowerMatrix();
		obj.addArray();
		obj.display();
		System.out.println("\n-----------------------------\n");
		obj.sumOfLowerTriangular();
	}

}
