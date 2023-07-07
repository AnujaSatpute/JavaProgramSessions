package exception_file_program;

import java.util.Scanner;

public class FirstProgram {
  
	   void add(int a,int b) {
		   System.out.println("Addition : "+(a+b));
	   }
	   public void subtract(int a, int b) {
			System.out.println("Subtract : "+(a-b));
		}
		
		public void division(int a,int b) {
		
			System.out.println("Division  : "+(a/b));
		}
		
		public void multiplication(int a, int b) {
			System.out.println("Multiplication : "+(a*b));
			
		}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number : ");
		int b= sc.nextInt();
		
		FirstProgram f1 = new FirstProgram();
		f1.add(a, b);
		f1.subtract(a, b);
		try {
		   f1.division(a, b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		   f1.multiplication(a, b);
		
		System.out.println("Done");
		
		
	}
}
