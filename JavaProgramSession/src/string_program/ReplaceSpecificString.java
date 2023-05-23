package string_program;

public class ReplaceSpecificString {
     static  void replace() {
    	  String s = "Core Java  Advance Java Core Java is good java is easy ";
    	   String str[] = s.split(" ");
    	   String s1 =" ";
    	   for(int i=0;i<str.length;i++) {
    		   if(str[i].equalsIgnoreCase("java")) {
    			   str[i] =str[i].toUpperCase();
    			   
    		   }
    		   s1 = s1+str[i]+" ";
    	   }
    	  System.out.println("New String is : "+s1);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replace();
	}

}
