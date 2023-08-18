package com.threadexamples2;

class MyThread extends Thread
{
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("MyThread:"+i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}
public class JoinDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		t1.start();
		
		for(int i=11;i<20;i++)
		{
			System.out.println("Main:"+i);
			try {
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
				
			}
		}
	}

}
