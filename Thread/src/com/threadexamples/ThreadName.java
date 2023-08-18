package com.threadexamples;

public class ThreadName extends Thread{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Priority : "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadName t1 = new ThreadName();
		t1.setName("My Thread" );
		t1.setPriority(7);
		t1.start();
	}

}
