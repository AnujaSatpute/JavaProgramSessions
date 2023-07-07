package java8features;

@FunctionalInterface
interface Sayable{
	public String sayHello();
}


public class TestLambdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Sayable s1 =()->
         {
        	String msg ="hi !! Good morning";
        	return msg;
         };
         System.out.println(s1.sayHello());
	}

}
