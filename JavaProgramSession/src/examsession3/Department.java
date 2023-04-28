package examsession3;

/*1.	WAP to have Department class created with id, name . Student class has roll, name and 
Department object should have id and name. Assign and print individual values in main method*/

public class Department {

	int id;
	String name;

	/*
	 * public Department(int id ,String name){ this.id =id; this.name =name; }
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
