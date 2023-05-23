package abstractionexamples;

public abstract class Car {
	int price;
	String color;

//	 Car(){
//		 price =75000;
//		 color ="RED";
//		 System.out.println("Default constructor car");
//	 }
	
	Car(int price,String color){
		this.price=price;
		this.color=color;
		 System.out.println("Parmaterized constructor car");
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void wheelNo() {
		System.out.println("car has 4 wheels");
	}

	void mirrors() {
		System.out.println("car has 3 mirrors");
	}

	abstract void engine();

	abstract void dashboard();

	abstract void seatingArrangment();

}
