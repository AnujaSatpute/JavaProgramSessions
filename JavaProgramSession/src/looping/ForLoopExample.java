package looping;

import java.util.Scanner;

public class ForLoopExample {

	void printNumberForward() {
		int num = 9;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Done");
	}

	void printNumberReverse() {
		int num = 5;
		for (int i = 10; i >= num; i--) {
			System.out.print(i + " ");
		}
		System.out.println("Done");
	}

	void factorialOfNumber() {
		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial Of Number Is :" + fact);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Forward Number ");
			System.out.println("2.Reverse Number ");
			System.out.println("3.Factorial Of Number ");
			System.out.println("Enter Your Choice :");
			int ch = sc.nextInt();
			ForLoopExample obj = new ForLoopExample();
			switch (ch) {
			case 1:
				obj.printNumberForward();
				break;
			case 2:
				obj.printNumberReverse();
				break;
			case 3:
				obj.factorialOfNumber();
				break;

			default:
				System.out.println("Enter The Correct Number ...");
			}

			System.out.println("If you Want To continue ..(y/n)");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');

	}
}