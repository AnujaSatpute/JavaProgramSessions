package array_assignment;

public class Character_Array {

	void characterCheck(char arr[]) {
		int i ;
		for(i=0;i<arr.length;i++) {
			if(arr[i] == 'y' || arr[i]== 'z') {
				arr[i] = (char)(arr[i]-24);
				System.out.println(arr[i]+" ");
			}
			else {
				arr[i] = (char)(arr[i]+2);
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char arr[] = {'a','b','c','d','y'};
        Character_Array a1 = new Character_Array();
        a1.characterCheck(arr);
        }
	}


