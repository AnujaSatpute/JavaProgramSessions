package com.threadexamples2;



public class JoinDemo2 {

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
				try {
					t1.join();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
		
		Thread t3 = new Thread() {
			public void run()
			{
				try {
					t2.join();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
		};
		
		t1.start();
		t2.start();
		t3.start();
	}

}
