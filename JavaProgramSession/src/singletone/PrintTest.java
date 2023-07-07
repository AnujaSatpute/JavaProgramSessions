package singletone;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Print p1= Print.getInstance();
		 Print p2=Print.getInstance();
		 System.out.println(p1.hashCode());
		 System.out.println(p2.hashCode());
	}

}
