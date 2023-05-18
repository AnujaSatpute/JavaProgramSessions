package containment;

public class AddressPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add1 = new Address();
		/*
		 * add1.setCity("Pune"); add1.setState("Maharashtra"); add1.setCountry("India");
		 */
		Address add2 = new Address();
		add2.setCity("chicago");
		add2.setState("US");
		add2.setCountry("US");
		
		Person p1 = new Person();
		p1.setId(874562);
		p1.setName("Aishwarya");
		p1.setContact(8956624);
		p1.setAdd(add1);
		p1.getAdd().setCity("pune");
		p1.getAdd().setCountry("Maharastra");
		p1.getAdd().setState("India");
		
		Person p2 = new Person();
		p2.setId(4562);
		p2.setName("shlok");
		p2.setContact(56646624);
		p2.setAdd(add2);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
