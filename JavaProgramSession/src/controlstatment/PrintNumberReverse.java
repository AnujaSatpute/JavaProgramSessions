package controlstatment;

import java.util.Scanner;

public class PrintNumberReverse {

	void reverse() {
		int s, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Point :");
		s = sc.nextInt();
		System.out.println("Enter the End Point :");
		a = sc.nextInt();

		while (s >= a) {
			System.out.print(s + " ");
			s--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNumberReverse print = new PrintNumberReverse();
		print.reverse();
	}

}
