package examsession6;

//4.	Remove all the occurrences of the word in the given string (without using replace function)
public class Program4 {

	static void remove(String str, char c) {

		int count = 0;
		char ch[] = str.toCharArray();
		String s =" ";
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == c) {
					ch[i]='\0';
					count++;
				}
			}
				if(ch[i] != '\0') {
					//System.out.print(ch[i]+" ");
					s=s+ch[i];
				}
		
		}
		System.out.println(s);
				
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloWorld";
		remove(s, 'l');
	}

}
