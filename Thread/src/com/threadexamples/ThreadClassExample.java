package com.threadexamples;

public class ThreadClassExample extends Thread {
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClassExample obj = new ThreadClassExample();
		obj.start();
	}

}
