package demojava;

import java.util.Scanner;

public class SumOfPrimeNumber {

	void sumOfPrime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		//int m = num/2;
		int cnt;
		int sum=0;
		for(int i=1;i< num;i++)
		{
			cnt=0;
			for(int j=2;j<i/2;i++)
			{
				if(i%j==0)
					cnt++;
				    break;
			}
			if(cnt==0 && i !=1)
			{
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfPrimeNumber obj = new SumOfPrimeNumber();
		obj.sumOfPrime();

	}

}
