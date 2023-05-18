package examsession4;
// WAP to print all unique elements in the array.
import java.util.Scanner;

public class Unique_Array {

	static void getUnique(int a[], int n) {
		int j;
		for (int i = 0; i < n; i++) {

			for (j = 0; j < i; j++)
				if (a[i] == a[j])
					break;
			if (i == j)
				System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l = input.nextInt();
		int[] a = new int[l];
		for (int i = 0; i < l; i++) {
			System.out.printf("Element of a[%d] :", i);
			a[i] = input.nextInt();
		}
		System.out.println("\nDisplay Array Unique Elements...\n");
		getUnique(a, l);
	}

}
