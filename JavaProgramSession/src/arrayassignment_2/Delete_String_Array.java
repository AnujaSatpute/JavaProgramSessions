package arrayassignment_2;

import java.util.Arrays;

public class Delete_String_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String arr[] = {"Java","Sql","Python","php","django"};
        String[] arr_new = new String[arr.length-1];
        int j=3;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

        
	}

}
