package abstractionexamples;

public class Pulsor implements Bike {

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Pulsor :  220cc");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Pulsor color : Black");
	}

	@Override
	public void mirrors() {
		// TODO Auto-generated method stub
		System.out.println("Pulsor has 2 mirrors................");
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("Pulsor has 2 wheels......");
		
	}

}
