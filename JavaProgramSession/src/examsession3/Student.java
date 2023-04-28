package examsession3;

public class Student {

	int rollnumber;
	String name;
	Department dept;

	/*
	 * Student(int rollnumber,String name, Department dept){ this.rollnumber =
	 * rollnumber; this.name = name; this.dept = dept; }
	 */
	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
