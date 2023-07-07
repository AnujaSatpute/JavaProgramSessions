package collection;

public class Person {
 
	int age;
	String name,contact, city;
	
	Person(String name ,int age, String contact, String city)
	{
		this.name = name;
		this.age=age;
		this.contact=contact;
		this.city = city;
	}
	public String toString()
	{
		return name+" "+age+" "+contact+" "+city;
	}
}
