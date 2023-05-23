package abstractionexamples;

public class Baleno extends Car{

	/*
	 * Baleno(){ 
	 * 		super(); 
	 *	    System.out.println("defult constructor baleno:");
	 *  }
	 */
	
	Baleno(int price ,String color){
		super(price,color);
		 System.out.println("parmetrized constructor baleno:");
	}
	 void engine() {
		 System.out.println("Baleno has 1200cc engine");
	 }

	 void dashboard() {
		 System.out.println("Baleno has diffrent dashboard");
	 }

	 void seatingArrangment() {
		 System.out.println("5 seats in baleno");
	 }

	 void shape() {
		 System.out.println("Baleno shape is round");
	 }
}