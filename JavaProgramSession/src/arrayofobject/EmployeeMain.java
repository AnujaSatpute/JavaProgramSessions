package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {

	Employee e1[] = new Employee[10];

	void addData() {
//		e1[0] = new Employee(101, "Aishwarya", "HR", 45000);
//		e1[1] = new Employee(102, "Rohini", "qa", 65000);
//		e1[2] = new Employee(103, "tejshree", "enginner", 50000);
//		e1[3] = new Employee(104, "komal", "HR", 70000);
//		e1[4] = new Employee(105, "neha", "HR", 55000);
//		e1[5] = new Employee(106, "roshani", "sales", 75000);
//		e1[6] = new Employee(107, "rima", "manager", 80000);
//		e1[7] = new Employee(108, "sima", "HR", 65000);
		
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<4;i++) {
			System.out.println("Enter id ,name ,dept,and salary of employee :");
			int id = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			int salary = sc.nextInt();
			
			Employee e2 = new Employee(id,name ,dept,salary);
			e1[i] = e2;
		}
	}

	void display() {
		
		System.out.println(Arrays.toString(e1));
		/*
		 * for (Employee e2 : e1) { if (e2 != null) { //if
		 * (e2.dept.equalsIgnoreCase("hr") && e2.salary > 60000) { //
		 * System.out.println(e2.name + " " + e2.salary); System.out.println(e2);
		 * 
		 * }
		 * 
		 * } }
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeMain obj = new EmployeeMain();
		obj.addData();
		obj.display();
	}

}
