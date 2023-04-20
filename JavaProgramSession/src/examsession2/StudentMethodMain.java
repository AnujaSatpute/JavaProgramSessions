package examsession2;

public class StudentMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMethods s1 = new StudentMethods(101, "Aishu", "a@gmail.com");
		StudentMethods s2 = new StudentMethods(100, "rohini", "rr@gmail.com");

		//invoke the hashcode() method using object
		int a = s1.hashCode(); //store hashcode int value in a
		int b = s2.hashCode(); //store hashcode int value in b
		System.out.println("hashcode of student1 = " + a);
		System.out.println("hashcode of student2 = " + b);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Comparing objects s1 and s2 = " + s1.equals(s2));// cheking both hashcode values are same or not
	}

}
