package examsession4;

//Q8)Write a Java program to test the equality of two arrays. Means e.g arr1[] = 
//[12, 22, 32, 42, 52, 62] and
//arr2[] = [52, 22, 62, 12, 42, 22] Here both arrays are equal.

public class Equality_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,50};
		int b[] = {10,20,30,50};
		boolean result = true;
		if(a.length == b.length) {
			for(int i = 0; i<a.length;i=i+1) {
				if(a[i] != b[i]) {
					result = false;
				}
			}
		}
		else {
			result = false;
		}
		if(result == true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
