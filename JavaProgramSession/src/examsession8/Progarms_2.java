package examsession8;

import java.util.ArrayList;
import java.util.Iterator;

//2.	Write a code that shows Iterator is fail fast.


public class Progarms_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
  
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {
                // will not throw Exception
                itr.remove();
            }
        }
  
        System.out.println(al);
  
        itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 3) {
                // will throw Exception on
                // next call of next() method
                al.remove(3);
            }
        }
	}

}
