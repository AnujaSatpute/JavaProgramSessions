package examsession3;

import java.util.Scanner;

public class AddressAndPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Address :city,state,country :");
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		String co = sc.next();
		String s = sc.next();
		System.out.println("Enter name ,age ,gender,and address :");
		String n = sc.next();
		String g = sc.next();
		int a = sc.nextInt();

		Address add2 = new Address(c, s, co);
		Person1 p1 = new Person1(n, g, a, add2);
		System.out.println("Address :" + add2);
		System.out.println("Person :" + p1);

		p1.setName("Abc");
		p1.setGender("Male");
		p1.setAge(55);
		p1.setAdd(add2);
		p1.getAdd().setCity("pune");
		p1.getAdd().setCountry("India");
		p1.getAdd().setState("Maharashtra");

		System.out.println(p1.getAdd().getCity() + " " + p1.getAdd().getState() + " " + p1.getAdd().getCountry());
		System.out.println(p1.getName() + " " + p1.getGender() + " " + p1.getAge() );
	}

}
