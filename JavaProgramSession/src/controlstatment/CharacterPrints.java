package controlstatment;

import java.util.Scanner;

public class CharacterPrints {
	
	void printCharacter() {
		
		char s , e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Point :");
		s = sc.next().charAt(0);
		System.out.println("Enter the End Point :");
		e = sc.next().charAt(0);
		
		while(s<=e) {
			System.out.print(s+" ");
			s++;
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterPrints ch = new CharacterPrints();
		ch.printCharacter();
	}

}
