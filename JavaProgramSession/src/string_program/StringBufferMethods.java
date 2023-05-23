package string_program;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer bf = new StringBuffer("Core Java");
        System.out.println(bf.capacity());
        System.out.println("Append : "+bf.append(" Language "));
        System.out.println("CharAt : "+bf.charAt(5));
        System.out.println("IndexOf : "+bf.indexOf("a"));
        System.out.println("LastIndexOF : "+bf.lastIndexOf("g"));
        System.out.println("Length of  : "+bf.length());
        System.out.println("Replace : "+bf.replace(5, 9, "JAVA"));
     //   System.out.println("Reverse : "+bf.reverse());
        System.out.println("Insert : "+bf.insert(4, 100));
        System.out.println("Substring : "+bf.substring(6,15));
        bf.setCharAt(4, 'L');
        System.out.println("SetCharAt : "+bf);
        System.out.println("Delete : "+bf.deleteCharAt(4));
        
        String s= "Core Java";
        s.concat("Langauge" );
        System.out.println(s);
	}

}
