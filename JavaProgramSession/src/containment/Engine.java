package containment;

public class Engine {
	int power;
	String name;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
	public String toString() {
		 return power+" "+name;
	}

	public Engine(int power, String name) {
		this.power = power;
		this.name = name;
	}
	
}
