package abstractionexamples;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Baleno b1 = new Baleno(700000,"Red");
		
		//  b1.setColor("Blue"); b1.setPrice(7000000); b1.engine(); b1.wheelNo();
		//  b1.seatingArrangment(); b1.mirrors(); b1.shape(); b1.dashboard();
		  
		  System.out.println(b1.getColor()+" "+b1.getPrice());
		 
	}

}
