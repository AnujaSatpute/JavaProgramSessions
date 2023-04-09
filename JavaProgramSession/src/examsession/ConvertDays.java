package examsession;

import java.util.Scanner;

/*
 * 2.	Write a Java program to convert days into years, weeks and days.
 */
public class ConvertDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m, year, days, weeks;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of days :");
		m = sc.nextInt();
		
		year = m/365;
		m = m%365;
		
		System.out.println("Number of years :"+year);
		
		weeks = m/7;
		m= m%7;
		
		System.out.println("Number of Weeks :"+weeks);
		
		days = m ;
		System.out.println("Number of days :"+days);

	}

}
