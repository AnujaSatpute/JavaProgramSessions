package abstractionexamples;

public class Calculator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new Calculator_interface();
		obj.add(10, 20);
		obj.subtract(30, 10);

		B obj1 = new Calculator_interface();
		obj1.square(5);
		obj1.multiplication(5, 3);
		
		System.out.println("\n------------------------------\n");
		
		Calculator_interface cal = new Calculator_interface();
		cal.add(5,9);
		cal.subtract(33,5);
		cal.multiplication(4,99);
		cal.square(5);
	}

}
