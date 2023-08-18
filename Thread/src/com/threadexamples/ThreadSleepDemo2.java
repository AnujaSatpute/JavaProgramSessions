package com.threadexamples;

class Thread4 extends Thread
{
	public void run()
	{
		for(int i=21;i<=25;i++)
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
}
public class ThreadSleepDemo2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread() {
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
		};
		Thread t2 = new Thread() {
			public void run()
			{
				for(int i=11;i<=15;i++)
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
		};
		
		Thread3 t4 = new Thread3();
		
		t1.start();
		t2.start();
		t4.start();
	}

}
