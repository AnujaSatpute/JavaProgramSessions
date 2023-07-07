package exception_file_program;

public class SingleTry_MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a=10,b=0;
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		String s =null;
		try {
			System.out.println(arr[4]);
			System.out.println(s.length());
			System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}
//		catch(NullPointerException e) {
//			e.printStackTrace();
//		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done.......!!!.....");
	}

}
