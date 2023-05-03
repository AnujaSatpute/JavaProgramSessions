package polymorphism;

import java.util.Scanner;

public class Shape {

	void area(double r) {
		double area;
		double pi = 3.14;

		area = pi * r * r;
		System.out.println("Area of circle :" + area);
	}

	static void area(int w, int l) {
		int area = l * w;
		System.out.println("Area of Rectangle :" + area);
	}

	static void area(double h, double b) {
		double area;
		area = 0.5 * b * h;
		System.out.println("Area of Traingle :" + area);
	}

	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius :");
		double r = sc.nextDouble();
		s.area(r);

		System.out.println("Enter width :");
		int w = sc.nextInt();
		System.out.println("Enter lenght :");
		int l = sc.nextInt();
		Shape.area(w, l);
		// s.area(10, 5);
		// s.area(2.0, 4.);
	

		System.out.println("Enter height :");
		double h = sc.nextDouble();
		System.out.println("Enter base :");
		double b = sc.nextDouble();
		Shape.area(h, b);
	}

}
