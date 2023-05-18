package arrayofobject;

public class Student_Crud {
	int id, contact, marks;
	String name, email;

	Student_Crud(int id, String name, String email, int contact, int marks) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.marks = marks;
	}

	public String toString() {
		return id + " " + name + " " + email + " " + contact + " " + marks;
	}
}
