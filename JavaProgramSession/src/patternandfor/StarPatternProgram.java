package patternandfor;

import java.util.Scanner;

public class StarPatternProgram {

	void starPattern1() {
		int r = 4;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void pattern2() {
		int r = 4;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	void pattern3() {
		int r = 4;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void pattern4() {
		int r = 64;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (r + i));
			}
			System.out.println();
		}
	}

	void pattern5() {
		int r = 64;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (r + j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		
          do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Star Pattern");
			System.out.println("2.Number Pattern");
			System.out.println("3.Number Pattern 2");
			System.out.println("4.Character Pattern");
			System.out.println("5.Character Pattern 2");
			System.out.println("Enter Your Choice");
			int ch = sc.nextInt();
			StarPatternProgram obj = new StarPatternProgram();
			switch (ch) {
			case 1:
				obj.starPattern1();
				break;
			case 2:
				obj.pattern2();
				break;
			case 3:
				obj.pattern3();
				break;
			case 4:
				obj.pattern4();
				break;
			case 5:
				obj.pattern5();
				break;
			
			}
			System.out.println("y?N");
			c = sc.next().charAt(0);

		} while (c == 'Y' || c == 'y');
	}
}
