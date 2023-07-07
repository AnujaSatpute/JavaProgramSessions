package singletone;

public class Mobile {

	 private static Mobile m = new Mobile();
	 
	 public static Mobile getInstance()
	 {
		 return m;
	 }
	 
	 }
