package looping;

import java.util.Scanner;

public class PrimeOrNot_DoWhile {

	void primeNumber() {

		char ch;
		do {
			int count = 0, i = 2;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number :");
			int num = sc.nextInt();
			while (num > i) {
				if (num % i == 0) {
					count++;
					break;
				}
				i++;
			}
			if (count == 0)
				System.out.println(num + " Number is prime number");
			else
				System.out.println(num + " Number is not a prime number");

			System.out.println("you want to continue..(y/n)");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeOrNot_DoWhile obj = new PrimeOrNot_DoWhile();
		obj.primeNumber();
	}

}
