package com.threadexamples;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}

	class Thread2 extends Thread
	{
		public void run()
		{
			for(int i=11;i<=15;i++)
			{
				System.out.println(Thread.currentThread().getName()+": "+i);
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	}
		class Thread3 extends Thread
		{
			public void run()
			{
				for(int i=21;i<=25;i++)
				{
					System.out.println(Thread.currentThread().getName()+": "+i);
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
		}


public class ThreadSleppDemo1 {

	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2= new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
