package com.threadexamples;

public class ThreadClassSleep extends Thread {
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClassSleep t1 = new ThreadClassSleep();
		ThreadClassSleep t2 = new ThreadClassSleep();
		t1.start();
		t2.start();
	}

}
