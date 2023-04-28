package containment;

import java.util.Scanner;

public class PAndLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter laptop name :");
		String l_name = sc.next();
		System.out.println("Enter laptop price :");
		int price = sc.nextInt();
		System.out.println("Enter laptop color:");
		String features = sc.next();
		
		Laptop l1 = new Laptop();
		l1.setL_Name(l_name);
		l1.setPrice(price);
		l1.setFeatures(features);
		
		System.out.println("Enter brand name :");
		String b_name = sc.next();
		System.out.println("ink color :");
		String ink = sc.next();
		System.out.println("Enter price :");
		int price1 = sc.nextInt();
		
		Printer p = new Printer();
		l1.setP(p);
		l1.getP().setB_Name(b_name);
		l1.getP().setInk(ink);
		l1.getP().setPrice(price1);
		
		System.out.println(l1.getL_Name());
		System.out.println(l1.getPrice()+"\n"+l1.getFeatures()+"\n"+l1.getP().getB_Name()+"\n"
		+l1.getP().getInk()+"\n"+l1.getP().getPrice());
		
		
	}

}
