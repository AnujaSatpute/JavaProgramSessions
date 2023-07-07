package wrapperclasses;

public class WrapperSimpleProgram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int x=100;
		Integer i = new Integer(x);//boxing version1.5
		System.out.println(i);
		
		Integer i2=100;//autoboxing
		
		Integer a = new Integer(1000);//unboxing version1.5
		int a1 = a.intValue();
		System.out.println(a);
		
		int a2=a;
		System.out.println(a2);//autounboxing
		
		System.out.println(i.equals(i2));
		System.out.println(i==i2);//memory location
		
		Float f1 = new Float("56.23");//3 constructor string,double,float;
		Boolean b1 = new Boolean("true");//2 constructor
		
		
	}

}
