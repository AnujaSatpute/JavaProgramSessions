package looping;

import java.util.Scanner;

public class ReverseNumber_DoWhile {

	void reverseNumber() {
		char ch;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :" );
			int a = sc.nextInt();
			int rev=0;
			while(a != 0) {
				int r= a%10;
				rev = rev*10+r;
				a=a/10;
				
			}
			System.out.println("Reverse number is :"+rev);
			
			System.out.println("Do You Want To Continue ...Press(Y/N)");
			ch=sc.next().charAt(0);
		}while(ch == 'y' || ch =='Y');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber_DoWhile obj = new ReverseNumber_DoWhile();
		obj.reverseNumber();
	}

}
