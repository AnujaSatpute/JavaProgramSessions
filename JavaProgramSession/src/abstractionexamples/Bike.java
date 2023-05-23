package abstractionexamples;

public interface Bike {
      
	void engine();
	void color();
	void mirrors();
	void wheels();
	default void headLight() {
		System.out.println("Bike has 1 headlight...");
	}
	
}
