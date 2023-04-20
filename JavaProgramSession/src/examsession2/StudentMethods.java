package examsession2;

/*
  1.	print 2 objects in sysout and see its hashcode is different
Eg Student@15db9742 and Student@2329742
*/

public class StudentMethods {

	int id;
	String name, email;

	public StudentMethods(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;

	}

	void setName(String name) {
		this.name = name;
	}

	/*
	 * public String toString() { return id + " " + name + " " + email; }
	 */
}
