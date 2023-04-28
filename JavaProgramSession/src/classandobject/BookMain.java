package classandobject;

import containment.Book;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Book b1 = new Book();
		 b1.setB_Id(101);
		 b1.setB_Name("Java");
		 b1.setPrice(300);
		 
		 System.out.println(b1.getB_Id()+" "+b1.getB_Name()+" "+b1.getPrice());
		 b1.check();
		 System.out.println(b1.getPrice());
	}

}
