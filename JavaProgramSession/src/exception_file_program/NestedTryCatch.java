package exception_file_program;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0;
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		String s = null;
		try 
		{
			try
			{
				try
				{
					System.out.println(arr[4]);
				} 
				catch (ArrayIndexOutOfBoundsException e) 
				{
					e.printStackTrace();
				}

				System.out.println(s.length());
			} 
			catch (NullPointerException e) 
			{
				e.printStackTrace();
			}
			System.out.println(a / b);
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Done......!!");
	}

}
