package controlstatment;

import java.util.Scanner;

public class ReverseNumber {

	void reverseNumber() {
		int s, e,num=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number  :");
		s = sc.nextInt();
		//System.out.println("Enter the End Point :");
		//e = sc.nextInt();
		
		while(s!=0) {
			
			int remainder = s%10;
			num= num*10 + remainder ;
			s = s/10;
		}
		System.out.print("The Reverse Number is :"+num);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseNumber rn = new ReverseNumber();
		rn.reverseNumber();
	}

}
