package arrayofobject;

//using containment and array
public class Car_Containment {
	int id;
	String name, company;
	long price;
	Engine_Containment e;

	Car_Containment(int id, String name, String company, long price, Engine_Containment e) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.e = e;
	}

	public String toString() {
		return id + " " + name + " " + company + " " + price + " " + e;
	}
}
