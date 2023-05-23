package abstractionexamples;

public class Bullet implements Bike{

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Engine : 12cc");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Color : Red");
	}

	@Override
	public void mirrors() {
		// TODO Auto-generated method stub
		System.out.println("2 mirrors");
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("2 wheels............");
	}

}
