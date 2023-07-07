package map_collection_java;

public class Employee {

	float salary;
	String name ,dept;
	
	Employee(String name ,String dept,float salary)
	{
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String toString() 
	{
		return name+" "+dept+" "+salary;
		
	}
}
