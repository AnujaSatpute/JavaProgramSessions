package array;

public class PrimeArray {
	void checkPrime(int arr[]) {
		
		
		for(int i=0;i<arr.length;i++) 
		{
			int cnt =0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j == 0) {
					cnt++;	
				}
			}
			if(cnt == 2) {
				System.out.println(" "+arr[i]);
			}
		}

	}
	void avg(int arr[]) {
		int sum =0;
		int a = 0;
		for(int i=0;i<arr.length;i++) {
			sum =sum+arr[i];
			a = sum/arr.length;
		}
		System.out.println("Average of array :"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int arr[]= {5,7,4,18,11,13,15,21,23,29,40};
		PrimeArray p1 = new PrimeArray();
		p1.checkPrime(arr);
		p1.avg(arr);
	}

}
