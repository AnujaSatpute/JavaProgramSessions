package examsession5;
//4.	WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, ‘R’], 
//so min character is ‘A’.
public class MinimumCharacter {
	void minChar(char arr[]) {
		char min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("Minimum character :" + min);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = { 'A', 'D', 'E', 'x', 'z', 'R' };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		MinimumCharacter obj = new MinimumCharacter();
		obj.minChar(arr);
	}

}
