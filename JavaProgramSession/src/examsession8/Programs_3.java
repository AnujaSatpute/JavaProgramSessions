package examsession8;
//3.	WAP to create a LinkedList<Emp> and search for Emp object whose eno=10 and delete 
//all the records whose dept is same as  eno 10.Emp(int id, String name Dept d)

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Programs_3 {

	void addData(LinkedList<Employee> list)
	{
		 list.add(new Employee(2,"Anuja","Computer"));
		 list.add(new Employee(10,"Aishwarya","Computer"));
		 list.add(new Employee(56,"rohini","It"));
		/* list.add(new Employee(41,"komal",new Department("Science")));
		 list.add(new Employee(89,"pooja",new Department("Arts")));	 
		 list.add(new Employee(22,"reema",new Department("Commerce")));
		 list.add(new Employee(63,"priya",new Department("Science")));
		 list.add(new Employee(10,"aayushi",new Department("Commerce")));
		 list.add(new Employee(23,"meenakshi",new Department("Science")));
		 list.add(new Employee(11,"geeta",new Department("Arts")));*/
	}
	
	void display(LinkedList<Employee> list)
	{
		System.out.println(list);
	}
	void search(LinkedList<Employee> list)
	{
	     
	}
	public static void main(String[] args) {
	
		 LinkedList<Employee> list = new LinkedList<>();
		
		 Programs_3 obj = new Programs_3();
		 obj.addData(list);
		 obj.display(list);
		 System.out.println("------------------------------\n");
		 obj.search(list);
	}

}
