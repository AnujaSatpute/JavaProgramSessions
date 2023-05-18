package arrayofobject;

import java.util.Arrays;

public class StudentMain {
	Student stu[] = new Student[15];

	void addData() {
		stu[0] = new Student(101, "Anuja", "Computer", 65);
		stu[1] = new Student(102, "Aishwarya", "Commerce", 75);
		stu[2] = new Student(103, "Rohini", "Arts", 55);
		stu[3] = new Student(104, "Komal", "Science", 69);
		stu[4] = new Student(105, "Shweta", "Computer", 89);
		stu[5] = new Student(106, "Rima", "BBA", 98);
		stu[6] = new Student(107, "Teju", "Science", 70);
		stu[7] = new Student(108, "Yogita", "Commerce", 77);
		stu[8] = new Student(109, "Pooja", "Computer", 44);
		stu[9] = new Student(110, "Priya", "Arts", 35);

	}

	void display() {
		for (Student s1 : stu) {
			if (s1 != null) {
				if (s1.dept.equalsIgnoreCase("computer") && s1.marks > 60) {
					System.out.println(s1);
				}
			}
		}
		System.out.println(Arrays.toString(stu));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMain s2 = new StudentMain();
		s2.addData();
		s2.display();
	}

}
