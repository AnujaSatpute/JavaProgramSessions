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
/*
 * interface Bike2 extends Bike{ void shape(); }
 */
/*
 * class Bike123 implements Bike2{
 * 
 * @Override public void engine() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void color() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void mirrors() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void wheels() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void shape() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */