package com.threadexamples;

public class RunnableDemo implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		RunnableDemo obj= new RunnableDemo();
		Thread t = new Thread(obj);
		t.start();
	}


}
