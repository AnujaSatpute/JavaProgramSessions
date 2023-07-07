package collection;

import java.util.LinkedList;

public class String_ArrayList {

	 void display(LinkedList<String> al1) {
		 for(String s :al1) {
			 if(s.startsWith("R")) {
				 System.out.println(s);
			 }
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> al = new LinkedList<>();
        al.add("Anuja");
        al.add("Ram");
        al.add("Raju");
        al.add("Reema");
        al.add("Nitin");
        al.add("Rekha");
        al.add("Yogesh");
        String_ArrayList obj= new String_ArrayList();
        obj.display(al);
	}

}
