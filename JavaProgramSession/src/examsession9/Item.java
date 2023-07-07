package examsession9;

/*1.	Customer does online shopping to leverage Diwali offers. Shopping list of Customers is maintained in
 *  following format: ArrayList<Item> Each Item has ID,name,price and qty. From ArrayList 
 *  of Items create a map <String,Integer> where Item Name is key and total quantity ordered for that Item as Value. 
Eg. Items in shpping list are:
[(112,”ParleG”, 20.00, 10),(113,”GoodDay”,40.00,30),
(112,”ParleG”, 20.00, 5),(113,”GoodDay”,40.00,10)]
Then Map would be like this :{{ParleG, 15},{GoodDay,40}}
*/
public class Item {
	  
	int id ;
	String name;
	int price,qty;
	
	Item(int id,String name,int price,int qty)
	{
		this.id= id;
		this.name = name;
		this.price =price;
		this.qty= qty;
	}
	
	public String toString()
	{
		return id+" "+name+" "+price+" "+qty;
	}
	
	

}
