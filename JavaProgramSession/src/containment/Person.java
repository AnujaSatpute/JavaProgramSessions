package containment;

public class Person {

	int id,contact;
	String name;
	Address add ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 public void setAdd(Address add) {
	 this.add = add;
	
}
 public Address getAdd() {
	 return add;
 }
	
	@Override
	public String toString() {
		return id + " " + name + " " + contact+ " " + add ;
	}
	
	
}
