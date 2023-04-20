package classandobject;

import java.util.Scanner;

public class CarDetails {
	
	int id;
	String name,company;
	int price;
	
	public CarDetails(int id , String name, String company , int price) {
		this.id = id;
		this.name =name;
		this.company=company;
		this.price=price;
	}
	
	public String toString() {
		return id +" "+name+ " "+company +" "+price+" ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter car id ,name ,company and price :");
		int i1 = sc.nextInt();
		String n1= sc.next();
		String c1 = sc.next();
		int p1 =sc.nextInt();
		//CarDetails car1 = new CarDetails();
		CarDetails car1 = new CarDetails(i1,n1,c1,p1);
	    System.out.println(car1);
		
		/*
		 * System.out.println("enter car id ,name ,company and price :"); i1 =
		 * sc.nextInt(); String n2= sc.next(); String c2 = sc.next(); int p2
		 * =sc.nextInt(); CarDetails car2 = new CarDetails(i1,n2,c2,p2);
		 * System.out.println(car2);
		 * 
		 * 
		 * System.out.println("enter car id ,name ,company and price :"); int i3 =
		 * sc.nextInt(); String n3= sc.next(); String c3 = sc.next(); int p3
		 * =sc.nextInt(); CarDetails car3 = new CarDetails(i3,n3,c3,p3);
		 * System.out.println(car3);
		 * 
		 */
	}

}
