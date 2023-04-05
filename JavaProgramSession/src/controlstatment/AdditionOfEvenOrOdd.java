package controlstatment;

import java.util.Scanner;

public class AdditionOfEvenOrOdd {

	void evenOrOdd() {
		int s, e, even = 0, odd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Point :");
		s = sc.nextInt();
		System.out.println("Enter the End Point :");
		e = sc.nextInt();

		while (s <= e) {
			if (s % 2 == 0) {
				even = even + s;

			} else {
				odd = odd + s;

			}
			s++;
		}
		System.out.println("Addition of even number : " + even);
	    System.out.println("Addition of odd number : " + odd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdditionOfEvenOrOdd eo = new AdditionOfEvenOrOdd();
		eo.evenOrOdd();
	}

}
