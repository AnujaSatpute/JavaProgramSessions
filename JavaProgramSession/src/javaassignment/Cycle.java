package javaassignment;

/*Create a class Cycle with member variables: int accountNo, int noOfWheels
a. Create a default constructor with a write in it “I am default
constructor”
b. Create another constructor which takes 2 arguments, calls the default
constructor using this keyword and has a print in it “I am another
constructor”.
c. In main method, create an object of type Cycle by using default
constructor(Note the output)
d. Create another object of type Cycle by using the parameterized
constructor( Note the sequence of print indicating that inner most
constructor is called first)
*/
public class Cycle {
	int accountNo;
	int noOfWheels;

	Cycle() {
		System.out.println("I am defult Constructor");
	}

	Cycle(int accountNo, int noOfWheels) {
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
		System.out.println("I am another Constructor");
	}

	void display() {
		System.out.println("Cycle number :" + accountNo + "\nNumber of wheels: " + noOfWheels);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle c1 = new Cycle();
		Cycle c2 = new Cycle(101,2);
		c2.display();
	}

}
