package examsession10;
//3.	Write a program to print following series. 0,1,3,6,10,15,21,28. Accept number of terms to print from user.

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc= new Scanner(System.in);
		 int num= sc.nextInt();
		 int d = 0; 
			for(int i=0;i<=num;i = d+i){ 
				System.out.println(i); 
				d++; 
			} 
	}

}
