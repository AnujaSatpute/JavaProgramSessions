package controlstatment;

import java.util.Scanner;

public class CharConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character :");
		ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			int i = ch-32;
			System.out.println("Character Converion is :"+(char)i);
		}
		else if(ch>='A' && ch<='Z') {
			int i= ch +32;
			System.out.println("Character Converion is :"+(char)i);
		}
		else 
			System.out.println("Enter the valid character...Not a number");
	}

}
