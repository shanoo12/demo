package com.example.demo;

public class ThreadCheck {

	
	public static  synchronized void  method1()
	{
		System.out.println("here in method 1"+	
				Thread.currentThread().getName());
	}
	public static  synchronized void  method2()
	{
		System.out.println("here in method 2"+	
				Thread.currentThread().getName());
	}
	
	public synchronized void method3() {
		System.out.println("here in method  3"+	
				Thread.currentThread().getName());
	}
	public synchronized void method4() {
		System.out.println("here in method  4"+	
				Thread.currentThread().getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadCheck tc=new ThreadCheck();
		System.out.println("The main thread"+Thread.currentThread().getName());
		Thread t1 = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	method1();
		    }
		});  
		t1.start();
		//t1.sleep(3000);
	
	Thread t2 = new Thread(new Runnable() {
	    @Override
	    public void run() {
	    	method2();
	    }
	});  
	t2.start();
	//t2.sleep(3000);
	
	Thread t3 = new Thread(new Runnable() {
	    @Override
	    public void run() {
	    	tc.method3();
	    }
	});  
	t3.start();
	//t3.sleep(3000);
	Thread t4 = new Thread(new Runnable() {
	    @Override
	    public void run() {
	    	tc.method4();
	    }
	});  
	t4.start();
	//t4.sleep(3000);
	
	}
	
	
	
}
