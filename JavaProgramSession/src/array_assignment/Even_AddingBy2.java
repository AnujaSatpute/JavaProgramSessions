package array_assignment;

/*q2) find out even numbers from giben array and increase them by 2
int arr[]={4,6,7,5,7,8};

o/p  6,8,7,5,7,10*/
public class Even_AddingBy2 {

	void even(int arr[]) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("A" + i + " " + arr[i]);
			if (arr[i] % 2 == 0) {
				num = arr[i] + 2;
				arr[i] = num;
			}

			System.out.println("Update " + arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 6, 7, 5, 7, 8 };
		Even_AddingBy2 a = new Even_AddingBy2();
		a.even(arr);
	}

}
