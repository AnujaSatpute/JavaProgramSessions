package classandobject;

import java.util.Scanner;

public class Employee {

	 int id;
	 String dept,name;
	 double salary;
	
	void setData() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee Id ,Name , Department, Salary ");
		 id = sc.nextInt();
		 sc.nextLine();
		 name = sc.nextLine();
		 dept = sc.next();
		 salary = sc.nextDouble();
		 
	 }
	 
	 void setDetails(int i , String n , String d , double s )
	 {
	    id=i;
	    name=n;
	    dept=d;
	    salary=s;
	 }
	 void display() {
		 System.out.println(id+" "+name +" "+dept+" "+salary);
	 }
}
