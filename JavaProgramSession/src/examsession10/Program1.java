package examsession10;
//2.	Write a program to print following series upto n. Accept n from user. 5, 13, 25, 41,61 , 85.

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			int ans = (i * i) + ((i - 1) * (i - 1));  
			System.out.println(ans+" ");
			
		}
	}

}
