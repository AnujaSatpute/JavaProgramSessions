package map_collection_java;
//USING TREE MAP
public class Book_1 implements Comparable<Book> {
	int id,price;
	String name;
	
	public Book_1(int id,String name,int price)
	{
		this.id = id;
		this.name =name;
		this.price=price;
	}
 
	public String toString()
	{
		return id+" "+name+" "+price;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

	}
