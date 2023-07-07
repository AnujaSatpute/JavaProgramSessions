package mcq_output_check;

class Static_Out
{
	 static int x;
	 static int y;
	 void add(int a,int b)
	 {
		 x=a+b;
		 y=x+b;
	 }
}
public class Static_Use {

	public static void main(String args[])
	{
		Static_Out obj1 = new Static_Out();
		Static_Out obj2 = new Static_Out();
		int a=2;
		obj1.add(a, a+1);
		obj2.add(5, a);
		System.out.println(obj1.x+" "+obj2.y);
	}
}