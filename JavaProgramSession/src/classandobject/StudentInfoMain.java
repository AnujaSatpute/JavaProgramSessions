package classandobject;

public class StudentInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		StudentInfo.universityInfo();
		
		StudentInfo s1 = new StudentInfo(101, "Anuja", "BE");
		StudentInfo s2 = new StudentInfo(102, "Aishwarya", "M.Sc");
		StudentInfo s3 = new StudentInfo(103, "Rohini", "B.Sc");
		StudentInfo s4 = new StudentInfo(104, "Teju", "12th");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(StudentInfo.university);
	}

}
