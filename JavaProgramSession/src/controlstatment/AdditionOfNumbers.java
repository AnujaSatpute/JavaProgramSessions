package controlstatment;

import java.util.Scanner;

public class AdditionOfNumbers {
	
	void additon()
	{
		int s, e, add=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Point :");
		s = sc.nextInt();
		System.out.println("Enter the End Point :");
		e = sc.nextInt();

		while(s<=e) {
			 add = add+s;
			 s++;
		}
		System.out.println("Addition of Number is :"+add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdditionOfNumbers add = new AdditionOfNumbers();
		add.additon();
	}

}
