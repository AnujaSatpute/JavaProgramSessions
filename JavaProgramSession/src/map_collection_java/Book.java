package map_collection_java;

public class Book {
	
	int id,price;
	String name;
	
	public Book(int id,String name,int price)
	{
		this.id = id;
		this.name =name;
		this.price=price;
	}
 
	public String toString()
	{
		return id+" "+name+" "+price;
	}
	
	public int hashCode()
	{
		return id;
	}

	public boolean equals(Object o)
	{
		Book b1 = (Book) o;
		if(this.id == b1.id)
			return true;
		else
			return false;
	}
}
