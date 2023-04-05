package controlstatment;

import java.util.Scanner;

public class VowelsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the character :");
		ch = sc.next().charAt(0);

		switch (ch) {
		case 'a':
			
		case 'e':
			
		case 'i':
			
		case 'o':
			
		case 'u':
			
		case 'A':
			
		case 'E':
			
		case 'I':
			
		case 'O':
			
		case 'U':
			System.out.println(ch + " is a Vowel ");
			break;
		default:
			System.out.println(ch + " is a consonanat ");
		}

	}

}
