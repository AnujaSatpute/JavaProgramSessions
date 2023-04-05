package corejavaclass;

public class AreaOfCircle {
 
	 public static void main(String args[]) {
		 
		double radius =3.5, areaOfCircle , pi=3.14;
		double c,d;
		
		areaOfCircle = pi*radius*radius;
		System.out.println("Area Of Circle is : "+areaOfCircle);
		
		c= 2*pi*radius;
		System.out.println("Circumference of a circle :"+c);
		
		d= 2*radius;
		System.out.println("Diameter of circle :"+d);
	 }
}
