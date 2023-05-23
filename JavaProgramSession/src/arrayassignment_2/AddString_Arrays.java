package arrayassignment_2;
/*8. WAJP2 add elements to a string array
9. WAJP2 print elements of array.*/

import java.util.Arrays;

public class AddString_Arrays {

	static void addArray(String arr[]) {
		int olenght = arr.length;
		String newString = "Java";
		String newarray[] = new String[olenght+1];
		for (int i = 0; i < arr.length; i++) {
			newarray[i] = arr[i];
		}
		newarray[newarray.length-1]=newString;
		arr=newarray;
		System.out.println("new Arrays : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "Sql", "django", "c++", "c", "python" };
		addArray(str);
	}

}
