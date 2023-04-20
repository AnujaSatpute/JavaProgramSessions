package oppsconcept;

public class AreaOfShapes {

	void area(int r) {
		System.out.println("Area of circle :"+(3.14f*r));
	}
	void area(int w , int l) {
		System.out.println("Area of rectangle :"+(w*l));
	}
	void area(float s) {
		System.out.println("Area of Square :"+(s*s));
	}
	void area(int b ,float h) {
		System.out.println("Area of Triangle: "+(0.5*b*h));
	}
	public static void main(String args[]) {
		AreaOfShapes a = new AreaOfShapes();
		a.area(5);
		a.area(10, 2);
		a.area(5, 4.5f);
		a.area(5.5f);
}
}