package arrayofobject;

public class Car {
	int id, price;
	String name, company;

	Car(int id, String name, String company, int price) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public String toString() {
		return id + " " + name + " " + company + " " + price;
	}

}
