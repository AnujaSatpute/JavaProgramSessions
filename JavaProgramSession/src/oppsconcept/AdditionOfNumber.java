package oppsconcept;

public class AdditionOfNumber {

	void add(int a ,int b) {
		System.out.println("Addition og number "+(a+b));
	}
	void add(int a ,int b,int c) {
		System.out.println("Addition og number "+(a+b+c));
	}
	void add(String a,String b) {
		System.out.println("Addition og number "+(a+" "+b));
	}
	void add(String a ,int b) {
		System.out.println("Addition og number "+(a+" "+b));
	}
	void add(String a ,float b) {
		System.out.println("Addition og number "+(a+" "+b));
	}
	void add(float a ,String b) {
		System.out.println("Addition og number "+(a+" "+b));
	}
	void add(int a ,float b) {
		System.out.println("Addition og number "+(a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOfNumber obj = new AdditionOfNumber();
		obj.add(10, 50);
		obj.add(10, 50,30);
		obj.add("WWW", "XYZ");
		obj.add("WWw", 50);
		obj.add("WWw", 50.5f);
		obj.add(10.5f, "XYX");
		obj.add(10, 50.5f);
		
	}

}
