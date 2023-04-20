package classandobject;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee Id ,Name , Department, Salary ");
		 int i = sc.nextInt();
		 sc.nextLine();
		 String n = sc.nextLine();
		 String d = sc.next();
		 double s = sc.nextDouble();
		 
       Employee e1 = new Employee();
       //e1.setData();
      // e1.setDetails(1,"Naman Sharma", "Doctor", 156000);
       e1.setDetails(i, n, d, s);
       e1.display();
       
       Employee e2 = new Employee();
      //e2.setData();
       e2.setDetails(121, "Muskan Sharma", "Student", 4500);
       e2.display();
	}

}
