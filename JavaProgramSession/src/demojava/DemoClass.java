package demojava;

public class DemoClass {

	void data(int num)
	{
		for(int i=100;i<=num;i++)
		{
			if(i%3!=0 || i%5!=0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		DemoClass obj = new DemoClass();
		obj.data(200);
		 
	}

}
