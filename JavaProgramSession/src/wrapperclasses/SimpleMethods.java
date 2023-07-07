package wrapperclasses;

public class SimpleMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println(Character.toUpperCase('A'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println("IS digit : "+Character.isDigit('9'));
		System.out.println("IS Chracter : "+Character.isLetter('f'));
		System.out.println("White Space : "+Character.isWhitespace('9'));
		System.out.println(Character.getNumericValue('2'));
		System.out.println(Integer.compare(270, 30));
		System.out.println(Integer.max(90,45));
		System.out.println(Integer.min(10, 60));
		System.out.println(Integer.toHexString(198));
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toOctalString(45));
		System.out.println(Integer.sum(10, 30));

	
	}

}
