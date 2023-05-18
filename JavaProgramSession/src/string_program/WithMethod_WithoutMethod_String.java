package string_program;

public class WithMethod_WithoutMethod_String {

	void characterWithPredefineMethod() {
		String s = "Hello Welcome to java sessions";
		int cnt =0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) == 'A' || s.charAt(i)=='a') {
				cnt++;
			}
		}
		System.out.println("Count ==> "+cnt);
	}
	void characterWithoutPredefineMethod() {
		String s = "Hello Welcome to java sessions";
		char ch[] = s.toCharArray();
		int cnt =0;
		for(int i =0;i<ch.length;i++) {
			if(ch[i] == 's' || ch[i]=='S') {
				cnt++;
			}
		}
		System.out.println("Count1 ==> "+cnt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithMethod_WithoutMethod_String obj = new WithMethod_WithoutMethod_String();
		obj.characterWithoutPredefineMethod();
		obj.characterWithPredefineMethod();
	}

}
