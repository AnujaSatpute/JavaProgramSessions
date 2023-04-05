package controlstatment;

import java.util.Scanner;

public class MaxiumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.println("Enter the 1st number:");
		a= sc.nextInt();
		System.out.println("Enter the 2nd number:");
		b= sc.nextInt();
		System.out.println("Enter the 3rd number:");
		c= sc.nextInt();
		System.out.println("Enter the 4th number:");
		d= sc.nextInt();
		
		if(a>b && a>c && a>d)
			System.out.println("The max number is "+a);
		else if(b>a && b>c && b>d)
			System.out.println("The max number is "+b);
		else if(c>a && c>b && c>d)
			System.out.println("The max number is "+c);
		else
		   System.out.println("The max number is "+d);
	}

}
