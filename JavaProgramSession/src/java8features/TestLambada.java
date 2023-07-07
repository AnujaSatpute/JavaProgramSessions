package java8features;
@FunctionalInterface
interface Vehicle
{
	public void drive();
}

//case-1 => by using child class
class Car implements Vehicle
{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("this is car drive method");
	}
	
}
public class TestLambada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//case-1
		Vehicle v=new Car();
		v.drive();
		
		//case2-anonymous nested class
		//class with does not have any name
		Vehicle v1= new Vehicle() {

			@Override
			public void drive() {
				// TODO Auto-generated method stub
				System.out.println("driving by anonymous way");
			}
		};
		v1.drive();
		
		//case3- lambda expression
		Vehicle v2=()->{
			System.out.println("driving by lambda expression");
			System.out.println("Thank you");
			System.out.println("bye");
		};
		v2.drive();
		
		//lambda expression with out {}
		//note:if method have only single statement
		Vehicle v3 =()-> System.out.println("driving by LE");
		v3.drive();
	}

}
