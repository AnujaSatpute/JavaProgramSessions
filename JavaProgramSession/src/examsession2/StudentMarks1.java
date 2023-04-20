package examsession2;

/*
 * 
4.	create student class assign marks and calculate the percentage and print 
*the result 1st class,2nd class etc.
 */
import java.util.Scanner;

public class StudentMarks1 {

	StudentMarks1(int m1,int m2,int m3,int m4,int m5) {
		int total = m1 + m2 + m3 + m4 + m5;
		System.out.println(total);
		double per = 0;
		per = (total / 5.0);
		System.out.println("Percentage :" + per);

		if (per >= 70 && per <= 100)
			System.out.println(per + " Distinction.");
		else if (per >= 60)
			System.out.println(per + " First Class");
		else if (per >= 50)
			System.out.println(per + " Second Class");
		else if (per >= 35)
			System.out.println(per + " pass");
		else
			System.out.println(per + " fail");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 subject marks :");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		
		StudentMarks1 s1= new StudentMarks1(m1,m2,m3,m4,m5);

	}

}
