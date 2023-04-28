package examsession3;

import java.util.Scanner;

public class DeptAndStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department Id and Name :");
		int id = sc.nextInt();
		String name = sc.next();
		System.out.println("Enter Student rollNumber ,name and department :");
		int rollnumber = sc.nextInt();
		String name1 = sc.next();

		Student s1 = new Student();
		s1.setRollnumber(rollnumber);
		s1.setName(name1);

		Department d1 = new Department();
		s1.setDept(d1);
		s1.getDept().setId(id);
		s1.getDept().setName(name);

		System.out.println("Student Roll Number :" + s1.getRollnumber() + "\n" + "Student name :" + s1.getName() + "\n "
				+"Deparment id : "+ s1.getDept().getId() + "\n "+"Deparment name :" + s1.getDept().getName());
	}

}
