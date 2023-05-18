package containment;

public class BookAuthorMain {

	
	public static void main(String args[]) {
		 Author a =new Author();
		 
		 Book12 b = new Book12();
		 b.setId(10);
		 b.setName("AAAA");
		 b.setA(a);
		 b.getA().setId(4555);
		 b.getA().setName("VVVVV");
		 
		 System.out.println(b.getId()+"\n"+b.getName()+"\n"+b.getA().getId()+"\n"+b.getA().getName());
	}
}
