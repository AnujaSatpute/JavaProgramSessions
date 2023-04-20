package examsession2;

/*2.	If you do this Student s1 = new Student(); Student s2 = s1;
Now print sop(s1) sop(s2) see both reference variables are
pointing to same location.`
But if you use new keyword for s1 and s2 see both values
would be different.*/


public class StudentObjectsCheck {

	int id;
	String name, dept;
	String email;
	int marks;

	public StudentObjectsCheck(int id, String name, String dept, String email, int marks) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.email = email;
		this.marks = marks;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //s1 == s2 
		StudentObjectsCheck s1 = new StudentObjectsCheck(101,"Anuja","Science","a@gmail.com",76);
		StudentObjectsCheck s2 = s1;
		int a = s1.hashCode(); //store hashcode int value in a
		int b = s2.hashCode(); //store hashcode int value in b
		System.out.println("hashcode of student1 = " + a);
		System.out.println("hashcode of student2 = " + b);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Comparing objects s1 and s2 = " + s1.equals(s2));
		
		//s3=s4(new values)
		
		StudentObjectsCheck s3 = new StudentObjectsCheck(101,"Anuja","Science","a@gmail.com",76);
		StudentObjectsCheck s4 = new StudentObjectsCheck(101,"Anuja","Science","a@gmail.com",76);
		int c = s3.hashCode(); //store hashcode int value in a
		int d= s4.hashCode(); //store hashcode int value in b
		System.out.println("hashcode of student3 = " + c);
		System.out.println("hashcode of student4 = " + d );
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("Comparing objects s3 and s4= " + s3.equals(s4));
	}

}
