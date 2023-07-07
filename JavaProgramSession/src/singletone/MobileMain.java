package singletone;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Mobile m1= Mobile.getInstance();
		 Mobile m2=Mobile.getInstance();
		 System.out.println(m1.hashCode());
		 System.out.println(m2.hashCode());
	}

}
