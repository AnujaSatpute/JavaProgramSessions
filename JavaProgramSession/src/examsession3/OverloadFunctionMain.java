package examsession3;

import java.util.Scanner;

public class OverloadFunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the two interger number:");
		 int a = sc.nextInt();
		 int b= sc.nextInt();
		 
		 System.out.println("Enter two Character value:");
		 char x = sc.next().charAt(0);
		 char y = sc.next().charAt(0);
		 
		 OverloadFunction o1 = new OverloadFunction();
		 o1.compare(a, b);
		 o1.compare(x, y);
	}

}
