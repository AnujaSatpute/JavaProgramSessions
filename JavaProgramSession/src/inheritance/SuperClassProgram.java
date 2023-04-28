package inheritance;

//Write  programs for multilevel inheritance
import java.util.Scanner;


class Mobile {
	String m_name;
	String color;
	int price;

	Mobile(String m_name, String color, int price) {
		this.m_name = m_name;
		this.color = color;
		this.price = price;
	}

	void display() {
		System.out.println("Enter the Mobile Brand name");
		System.out.println(m_name + " " + color + " " + price);
	}
}

class Iphone11 extends Mobile {
	int ram;

	Iphone11(String m_name, String color, int price, int ram) {
		super(m_name, color, price);
		this.ram = ram;
	}

	void view() {
		super.display();
		System.out.println("IPhone11 ram :");
		System.out.println("Ram : "+ram);
	}

}

class Iphone12 extends Iphone11{
 
	int camera ;
	String  features;
	Iphone12(String m_name, String color, int price, int ram , int camera , String features) {
		super(m_name, color, price, ram);
		this.camera = camera;
		this.features = features;
	}
	void view() {
		super.view();
		System.out.println("Iphone12 Updated features");
		System.out.println(" Camera "+camera+" Features  "+features);
	}

	
}

public class SuperClassProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile name ");
		String m_name = sc.next();
		System.out.println("Enter color");
		String color = sc.next();
		System.out.println("Enter price");
		int price = sc.nextInt();
		System.out.println("Enter ram ");
		int ram = sc.nextInt();
		System.out.println("Enter Camera pixel ");
		int camera = sc.nextInt();
		System.out.println("Enter Features ");
		String features = sc.next();
		
		Iphone12 i = new Iphone12( m_name,  color,  price,  ram ,  camera ,  features);
		i.view();

	}

}
