package examsession3;

/*3.	Design a class to overload a function compare( ) as follows:
(a) void compare (int, int) – to compare two integer values and print the greater of the two integers.
(b) void compare (char,char) – to compare the numeric value of two characters and print
 the character with higher numeric value
*/
public class OverloadFunction {

	public void compare(int a ,int b ) {
		 
		 if(a>b) {
			 System.out.println("Greater of  two number :"+a);
		 }
		 else {
			 System.out.println("Greater of  two number :"+b);
		 }
	 }
	 public void compare(char a, char b) {
		 int x = (int)a;
		 int y = (int)b;
		 
		 if(x>y) {
			 System.out.println("character with higher numeric value :"+a);
		 }
		 else {
			 System.out.println("character with higher numeric value :"+b);
		 }
	 }
}
