package containment;

public class Car {
	
	int id,price;
	String name, company;
	Engine eng;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	public String toString() {
		return id+" "+name+" "+company+" "+price+" "+eng;
	}
	
	
	public Car(int id,  String name, String company,int price, Engine eng) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.eng = eng;
	}

}
