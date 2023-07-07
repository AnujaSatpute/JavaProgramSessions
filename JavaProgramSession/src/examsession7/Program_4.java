package examsession7;
//4.	WAP to show 3 different scenario in which null pointer exceptions generated, and handle that exception.

public class Program_4 {

	void checkStringNull() 
	{
		String str = null;
		try 
		{
			if (str.equals("fool"))
			{
				System.out.println("same");

			}
			else
				System.out.println("not same");
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
	}

	
	void checkNull(int arr[])
	{
		try
		{
			System.out.println(arr.length);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	 int sum(int a , int b) 
	 {
	        return a + b;
     }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Program_4 obj = new Program_4();
		 obj.checkStringNull();
		int arr[] = null;
		obj.checkNull(arr);
		try
		{
			Program_4 obj1 =null;
			System.out.println(obj1.sum(10, 20));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
