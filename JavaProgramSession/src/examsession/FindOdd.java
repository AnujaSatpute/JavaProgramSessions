package examsession;

import java.util.Scanner;

/*
 * 3.	WAP to print odd numbers from 521 to 229 using while loop. 
 */
public class FindOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number :");
		int s = sc.nextInt();
		System.out.println("Enter the end number :");
		int e = sc.nextInt();
		
	   while(s >= e) {
		   if(s%2 == 1) {
			   System.out.print(s+" ");
			   
		   }
		   s--;
	   }

	}

}
