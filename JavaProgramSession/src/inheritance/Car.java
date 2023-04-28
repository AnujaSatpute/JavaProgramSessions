package inheritance;

public class Car {

	int price;
	String color;

	void wheelNo() {
		System.out.println("Car has 4 wheel");
	}
	
	void dashboard() {
		 
		System.out.println("Every car will have dashboard with music system...");
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}
