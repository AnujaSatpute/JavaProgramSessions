package array2D_program;

import java.util.Scanner;

public class Arrays_2D_SimpleProgram {
	int arr[][] = new int[3][3];

	void addArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
	}

	void display() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	void diagonalArraySum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("Sum of diagonal elements :" + sum);
	}

	void sumOfEachRow() {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Sum of Each" + (i + 1) + "Row: " + sum);
		}
	}
   
	 void sumOfUpperTriangular() {
		 int sum=0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i < j) {
						sum = sum + arr[i][j];
					}
				}
			}
			System.out.println("Sum of upper triangular elements :" + sum);
		}
	 void sumOfLowerTriangular() {
		 int sum=0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i > j) {
						sum = sum + arr[i][j];
					}
				}
			}
			System.out.println("Sum of lower triangular elements :" + sum);
		}
	 void sumOfEachColumn() {
						for (int i = 0; i < arr.length; i++) {
							int sum=0;

				for (int j = 0; j < arr.length; j++) {
				
						sum = sum + arr[j][i];
						
				}
				System.out.println("Sum of Each" + (i + 1) + "Column: " + sum);		
			}
			
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays_2D_SimpleProgram obj = new Arrays_2D_SimpleProgram();
		obj.addArray();
		obj.display();
		System.out.println("\n------------------------->\n");
		obj.diagonalArraySum();
		System.out.println("\n------------------------->\n");
		obj.sumOfEachRow();
		System.out.println("\n------------------------->\n");
		obj.sumOfUpperTriangular();
		System.out.println("\n------------------------->\n");
		obj.sumOfEachColumn();
		System.out.println("\n------------------------->\n");
		obj.sumOfLowerTriangular();
	}

}
