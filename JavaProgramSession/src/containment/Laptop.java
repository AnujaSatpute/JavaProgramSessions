package containment;

public class Laptop {
	
	String l_name;
	int price;
	String features;
	Printer p;
	
	public void setL_Name(String l_name) {
		this.l_name =l_name;
	}
	public String getL_Name() {
		return l_name;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setFeatures(String features) {
		this.features = features;
	}
	
	public String getFeatures() {
		return features;
	}
	
	public void setP(Printer p) {
		this.p = p;
	}
	public Printer getP() {
		return p;
	}
	
	public String toString() {
		return l_name + " "+price+" "+features+" "+p;
	}

}
