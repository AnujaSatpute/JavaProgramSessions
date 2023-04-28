package examsession3;

//Person which has attributes (name, gender, age, Address)

public class Person1 {
	int age;
	String name, gender;
	Address add;

	public Person1(String name, String gender, int age, Address add) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.add = add;
	}

	/*
	 * Person1(){ this.name = name; this.gender = gender; this.age = age; this.add =
	 * add; }
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdd(Address add1) {
		this.add = add1;

	}

	public Address getAdd() {
		return add;
	}

	public String toString() {
		return name + " " + gender + " " + age + " " + add;
	}

}
