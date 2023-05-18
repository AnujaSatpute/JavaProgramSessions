package examsession4;
//WAP to arrange the elements of an given array of integers where all negative integers
//appear before all the positive integers.
public class Order_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3, -2, 1, 2, 3, -6, 9, -8, -5};
		for (int i = 0; i < nums.length; i++){
		    if(nums[i] < 0) {
		        System.out.print(nums[i] + " ");
		    }
		}
		for (int i = 0; i < nums.length; i++){
		    if(nums[i] > 0) {
		        System.out.print(nums[i] + " ");
		    }
		}
	}

}
