package examsession7;
//1.	WAP to return int value in try block and return int value in finally

//block and observe which return takes precedence.

public class Program_1 {
	@SuppressWarnings("finally")
	int method() {
		int a = 20, b = 0;
		
		try 
		{
			System.out.println("I am in try block");
			int c = a / b;
			System.out.println("Result: " + c);
		} 
		catch (ArithmeticException ae)
		{
			System.out.println("I am in catch block");
			return 40;
		} 
		finally 
		{
			System.out.println("I am in finally block");
			return 50;
		}
	//	System.out.println("Statement after finally block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_1 obj = new Program_1();
		System.out.println(obj.method());
	}

}
