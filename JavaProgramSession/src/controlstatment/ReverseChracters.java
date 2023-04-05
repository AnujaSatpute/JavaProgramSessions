package controlstatment;

import java.util.Scanner;

public class ReverseChracters {

	void reverseChar()
	{
		char s, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Point :");
		s = sc.next().charAt(0);
		System.out.println("Enter the End Point :");
		a = sc.next().charAt(0);

		while (s >= a) {
			System.out.print(s + " ");
			s--;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseChracters revers = new ReverseChracters();
		revers.reverseChar();
		
	}

}
