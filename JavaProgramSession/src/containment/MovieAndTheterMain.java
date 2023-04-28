package containment;

import java.util.Scanner;

public class MovieAndTheterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Enter the movie name,price and rating :");
		 Scanner sc = new Scanner(System.in);
		 String mname = sc.next();
		 int price = sc.nextInt();
		 float rating = sc.nextFloat();
		 int tid = sc.nextInt();
		 String tname =sc.next();
		  
		 Theater  t1 = new Theater();
		 t1.setTId(tid);
		 t1.setTName(tname);
		 
		 Movie m1 = new Movie();
		 t1.setM(m1);
		 t1.getM().setM_Name(mname);
		 t1.getM().setPrice(price);
		 t1.getM().setRating(rating);
		 
		 System.out.println(t1.getTId()+" "+t1.getTName()+" "+t1.getM().getM_Name()+" "
		 +t1.getM().getPrice()+" "+t1.getM().getRating());
		//System.out.println(t1.getM());
		 
		 t1.getM().discount();
		 System.out.println(t1.getM().getPrice());
		 
		 
	}

}
