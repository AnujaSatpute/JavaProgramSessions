package abstractionexamples;

public class Calculator_interface implements A,B {
   
	public void add(int a,int b) {
		System.out.println("Addition : "+(a+b));
	}
	public void subtract(int a, int b) {
		System.out.println("Subtract : "+(a-b));
	}
	
	public void square(int a) {
	
		System.out.println("Square : "+(a*a));
	}
	
	public void multiplication(int a, int b) {
		System.out.println("Multiplication : "+(a*b));
		
	}
}
