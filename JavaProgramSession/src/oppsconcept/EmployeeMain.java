package oppsconcept;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Aishwarya");
		e1.setDept("Manager");
		e1.setSalary(452000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id , Name ,Department,Salary :");
		int id = sc.nextInt();
		String name = sc.next();
		String dept = sc.next();
		double salary = sc.nextDouble();

		Employee e2 = new Employee();
		e2.setId(id);
		e2.setName(name);
		e2.setDept(dept);
		e2.setSalary(salary);
		System.out.println(" Id: " + e1.getId() + "\n" + " Name: " + e1.getName() + "\n" + " Department: "
				+ e1.getDept() + "\n" + " Salary: " + e1.getSalary());

		System.out.println(" Id: " + e2.getId() + "\n" + " Name: " + e2.getName() + "\n" + " Department: "
				+ e2.getDept() + "\n" + " Salary: " + e2.getSalary());
	}

}
