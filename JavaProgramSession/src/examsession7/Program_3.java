package examsession7;
//3.	WAP to show the scenario in which number-format exception is generated and handle this exception.


public class Program_3 {
	
	void checkError() throws NumberFormatException
	{
		int x = Integer.parseInt("3A");
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		try 
		{
			Program_3 obj = new Program_3();
			obj.checkError();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
	}

}
