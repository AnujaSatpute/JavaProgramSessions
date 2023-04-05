package controlstatment;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Square of two numbers");
		System.out.println("Enter your Choice :");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Addition of two number is :" + (a + b));
			break;
		case 2:
			System.out.println("Subtraction of two number is :" + (a - b));
			break;
		case 3:
			System.out.println("Multiplication of two number is :" + (a * b));
			break;
		case 4:
			System.out.println("Division of two number is :" + (a / b));
			break;
		case 5:
			System.out.println("Square of 1st number is :" + (a * a));
			System.out.println("Square of 2nd number is :" + (b * b));
			break;
		default:
			System.out.println("Please enter correct option ....");
		}
	}

}
