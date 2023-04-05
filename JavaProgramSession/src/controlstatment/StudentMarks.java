package controlstatment;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double per;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the percentage of student :");
		per = sc.nextDouble();

		if (per >= 70 && per <= 100)
			System.out.println("Distinction.");
		else if (per >= 60)
			System.out.println("First Class");
		else if (per >= 50)
			System.out.println("Second Class");
		else if (per >= 35)
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}
