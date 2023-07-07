package examsession8;
//3.	WAP to create a LinkedList<Emp> and search for Emp object whose eno=10 and delete
//all the records whose dept is same as  eno 10.Emp(int id, String name Dept d)

public class Employee {
   int id;
   String name;
   //Department d;
   String d;
   
   Employee(int id,String name ,String d)
   {
	   this.id =id;
	   this.name = name;
	   this.d = d;
   }
   
   public String toString()
   {
	   return id+" "+name+" "+d;
   }
   
}
