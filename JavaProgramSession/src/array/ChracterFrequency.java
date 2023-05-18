package array;

public class ChracterFrequency {

	static void countArray(char arr[]) {
		for (int i = 0; i < arr.length; i++) {

			boolean visited = false;
			int count = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;

					}
				}
				System.out.println(arr[i] + "---->" + count);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char arr[]= {'a','b','c','d','a','c','c','b','a','f','g'};
		 countArray(arr);
	}

}
