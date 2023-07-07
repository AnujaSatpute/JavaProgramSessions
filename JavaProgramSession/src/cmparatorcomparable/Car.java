package cmparatorcomparable;

public class Car implements Comparable<Car> {
    
	int id,price;
	String name , company;
	
	Car(int id,String name,String company,int price)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
	}
	public String toString() 
	{
		return id+"\t"+name+"\t"+company+"\t"+price;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	

}
