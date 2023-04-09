package examsession;

import java.util.Scanner;

/*
 * 1.	Write a Java program to enter length and breadth of a rectangle and find its perimeter.
 */
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle :");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of rectangle :");
		int b = sc.nextInt();
		
		int per ;
		per = (2*l)+(2*b);
		System.out.println("Perimeter of Rectangle :" + per);
		
	}

}
