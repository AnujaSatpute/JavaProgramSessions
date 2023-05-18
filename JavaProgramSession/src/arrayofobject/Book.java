package arrayofobject;

public class Book {
  int id,price,copynumber;
  String name;
  
  Book(int id,String name,int price,int copynumber){
	  this.id =id;
	  this.name = name;
	  this.price =price;
	  this.copynumber = copynumber;
  }
  public String toString() {
	  return id+" "+name+" "+price+" "+copynumber;
  }
  
}
