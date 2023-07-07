package exception_file_program;

public class StringLength_Using_throw {
	
	int getStringLength(String s) throws NullPointerException {//using throws keyword we can declare number of excepitons
		if(s==null) {
			throw new NullPointerException("String can not be null....Please enter valid string...");//only one exception is use
		}
		return s.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLength_Using_throw obj = new StringLength_Using_throw();
		System.out.println(obj.getStringLength("India"));
		try {
		System.out.println(obj.getStringLength(null));
		}
		catch(Exception e)//we can give customize string.
		{
			System.out.println("String can notbe null.."+e);
			e.printStackTrace();
		}
		System.out.println(obj.getStringLength("Is my country"));
		System.out.println(obj.getStringLength("Java Language..."));
	}

}
