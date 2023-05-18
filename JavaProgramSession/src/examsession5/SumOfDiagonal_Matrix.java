package examsession5;

//1.	WAJP2 find sum of main diagonal elements of a matrix.
import java.util.Scanner;

public class SumOfDiagonal_Matrix {
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

	void diagonalArraySum() {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("Sum of diagonal elements :" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDiagonal_Matrix obj = new SumOfDiagonal_Matrix();
		obj.addArray();
		obj.display();
		System.out.println("\n--------------------------------------------\n");
		obj.diagonalArraySum();
	}

}
