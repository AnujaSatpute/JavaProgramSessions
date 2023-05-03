package javaassignment;

import java.util.Scanner;

/*Create one class Employee (id , name, salary) with private access modifier
and create getter and setter and display details.*/

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return name ;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID ");
		int id = sc.nextInt();
		System.out.println("Enter Name :");
		String name = sc.next();
		System.out.println("Enter salary :");
		float salary = sc.nextFloat();
		
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		
		System.out.println("ID :"+e1.getId()+"\n"+"Name :"+e1.getName()+"\n"+"Salary :"+e1.getSalary());
	}

}
