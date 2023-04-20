package classandobject;

import java.util.Scanner;

public class EmployeeConstructor {
	int id;
	String name, dept;
	int salary;

	EmployeeConstructor() {
		id = 10;
		name = "Anuja";
		dept = "Sales";
		salary = 45000;
	}

	EmployeeConstructor(int id, String name, String dept, int salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	EmployeeConstructor e1 = new EmployeeConstructor();
	//	System.out.println(e1);
		
		Scanner sc = new Scanner(System.in);
		
    /*  System.out.println("How many Employee you wants :");
		int n = sc.nextInt();*/
		
		System.out.println("Enter id , name ,dept,and salary of employee :");
		int id = sc.nextInt();
		String name = sc.next();
		String dept = sc.next();
		int salary = sc.nextInt();

		EmployeeConstructor e2 = new EmployeeConstructor(id, name, dept, salary);
		System.out.println(e2);
		
		System.out.println("Enter id , name ,dept,and salary of employee :");
		int id1 = sc.nextInt();
		String name1 = sc.next();
		String dept1 = sc.next();
		int salary1 = sc.nextInt();

		EmployeeConstructor e3 = new EmployeeConstructor(id1, name1, dept1, salary1);
		System.out.println(e3);
		
		System.out.println("Enter id , name ,dept,and salary of employee :");
		int id2 = sc.nextInt();
		String name2 = sc.next();
		String dept2 = sc.next();
		int salary2 = sc.nextInt();

		EmployeeConstructor e4 = new EmployeeConstructor(id2, name2, dept2, salary2);
		System.out.println(e4);

		// EmployeeConstructor e3 = new
		// EmployeeConstructor(101,"Arnav","medical",100000);
		// System.out.println(e3);

	}

}
