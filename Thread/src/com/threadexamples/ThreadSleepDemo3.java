package com.threadexamples;

public class ThreadSleepDemo3 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread() {
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
		}.start();
		
		new Thread() {
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
		}.start();
		new Thread() {
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
		}.start();
	}

}
