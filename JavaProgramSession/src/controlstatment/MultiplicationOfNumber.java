package controlstatment;

import java.util.Scanner;

public class MultiplicationOfNumber {

	void mult() {
		int s, e, mult = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Point :");
		s = sc.nextInt();
		System.out.println("Enter the End Point :");
		e = sc.nextInt();

		while (s <= e) {
			mult = mult * s;
			s++;
		}
		System.out.print("Multiplication of N Number is :" + mult);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationOfNumber mn = new MultiplicationOfNumber();
		mn.mult();

	}

}
