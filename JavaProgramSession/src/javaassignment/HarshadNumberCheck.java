package javaassignment;

import java.util.Scanner;

/*Check whether number is HArshad number or not
Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.



Example :

Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not.*/

public class HarshadNumberCheck {

	public void check(int num) {
		int n = num;
		int rem = 0, sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum " + sum);
		if (n % sum == 0) {
			System.out.println(n + "  is a harshad number.");
		} else
			System.out.println(n + "  is not a harshad number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Harshad Number :"); 
		  int num = sc.nextInt();
		  HarshadNumberCheck h1 = new HarshadNumberCheck();
		  h1.check(num); 
		  sc.close();
		 

	}

}
