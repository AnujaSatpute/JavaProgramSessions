package containment;

public class Book {

	 private int b_id;
	 private String b_name;
	 private int price;
	 
	 public void setB_Id(int b_id) {
		 this.b_id = b_id;
	 }
	 public int getB_Id() {
		 return b_id;
	 }
	 public void setB_Name(String b_name) {
		 this.b_name = b_name;
	 }
	 public String getB_Name() {
		 return b_name;
	 }
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 public int getPrice() {
		 return price;
	 }
	 
	public void check() {
		 if(b_name.equals("Java")) {
			 price = price - 50;
			 System.out.println("Price of book :"+price);
		 }
}
}
