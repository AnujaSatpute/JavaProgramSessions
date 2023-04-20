package classandobject;

public class StudentInfo {

	int id;
	String name ,branch;
	static String  university ;
	
	StudentInfo(int id , String name, String branch){
		
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	
	public String toString() {
		return id+" "+name+" "+branch+" "+university;
	}
	
	static void universityInfo() {
		university = "Pune University";
		System.out.println("Full Name : Savitribai Phule Pune University");
		System.out.println(university);
	}
   
}
