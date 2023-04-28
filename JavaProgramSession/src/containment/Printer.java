package containment;

public class Printer {

	String b_name;
	String ink;
	int price;
	
	public void setB_Name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_Name() {
		return b_name;
	}
	
	public void setInk(String ink) {
		this.ink = ink;
	}
	public String getInk() {
		return ink;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return b_name +" "+ink+" "+price;
	}
}
