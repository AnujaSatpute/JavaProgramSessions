package inheritance;

import java.util.Scanner;

public class Bank {

	String b_name;
	String branch;
	String city;
	float rate;

	void showBank() {
		System.out.println("Enter the all bank display :");
	}
}

class AxisBank1 extends Bank {
	String b_name = "Axis Bank";
	String branch = "Pune";
	String city = "Wakad";

	float rate = 0.0f;

	Scanner sc = new Scanner(System.in);
	int age;

	void rateOfIntrest() {
		System.out.println("enter your age :");
		age = sc.nextInt();
		if (age > 60) {
			rate = 7.8f;
			System.out.println("rate of intrest:" + rate);
		} else if (age > 40) {
			rate = 6.3f;
			System.out.println("rate of intrest:" + rate);
		} else {
			rate = 5.5f;
			System.out.println("rate of intrest:" + rate);
		}
	}

	void display() {
		System.out.println(b_name + " " + branch + " " + city + " " + age + " " + rate);
	}

}

class ICICIBank extends Bank {
	String b_name = "ICICI Bank";
	String branch = "Pune";
	String city = "Wakad";

	float rate = 0.0f;

	Scanner sc = new Scanner(System.in);
	int age;

	void rateOfIntrest() {
		System.out.println("enter your age :");
		age = sc.nextInt();
		if (age > 60) {
			rate = 7.9f;
			System.out.println("rate of intrest:" + rate);
		} else if (age > 40) {
			rate = 6.6f;
			System.out.println("rate of intrest:" + rate);
		} else {
			rate = 5.3f;
			System.out.println("rate of intrest:" + rate);
		}
	}

	void display() {
		System.out.println(b_name + " " + branch + " " + city + " " + age + " " + rate);
	}

}