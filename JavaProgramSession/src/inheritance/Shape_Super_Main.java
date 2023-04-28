package inheritance;

import java.util.Scanner;

/*2. Create a class named 'Rectangle' with two data members 'length' and
'breadth' and two methods to print the area and perimeter of the rectangle
respectively. Its constructor having parameters for length and breadth is
used to initialize length and breadth of the rectangle. Let class 'Square'*/

class Rectangle{
	int lenght;
	int breadth;
	int area,per;
	
	Rectangle(int length,int breadth){
		this.lenght = length;
		this.breadth = breadth;
	}
	void area() {
		area = lenght*breadth;
		System.out.println("Area of Rectangle :"+area);
	}
	void perimeter() {
		per = 2*lenght+2*breadth;
		System.out.println("Perimeter of rectangle :"+per);
	}
	void display() {
		System.out.println("Lenght :"+lenght+" Breadth: "+breadth);
	}
}
class Square extends Rectangle{
	int side ;
	Square(int side,int length, int breadth ){
		super(length,breadth);
		this.side =side;
	}
	void area() {
		super.area();
		super.area = side*side;
		System.out.println("Area of square :"+area);
	}
	void perimeter() {
		super.perimeter();
		super.per = 4*side;
		System.out.println("Perimeter of square: "+per);
	}
	void display() {
		super.display();
		System.out.println("Side :"+side);
	}
}
public class Shape_Super_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght :");
		int l = sc.nextInt();
		System.out.println("Enter breadth :");
		int b = sc.nextInt();
		System.out.println("Enter side :");
		int s = sc.nextInt();
		Square s1 = new Square(s,l,b);
		s1.area();
		s1.perimeter();
		s1.display();
		
	}

}
