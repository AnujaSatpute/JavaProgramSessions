package arrayofobject;

//using containment and array
public class Engine_Containment {
	String company;
	int power;

	Engine_Containment(String company, int power) {
		this.company = company;
		this.power = power;
	}

	public String toString() {
		return company + " " + power;
	}
}
