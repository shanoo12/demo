package com.example.demo;

import javax.sql.rowset.spi.SyncResolver;

public class PrintAlternateZero {
	
public  synchronized void test() throws InterruptedException {
	wait();
}
public static void main(String[] args) {
	PrintAlternateZero p=new PrintAlternateZero();
	Thread t1 =new Thread() {
		
		@Override
		public void run() {
			while(true)
			{
				System.out.println("0");
				
				try {
					p.test();
					p.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
Thread t2 =new Thread() {
		
		@Override
		public void run() {
			while(true)
			{
				System.out.println("1");
				
				try {
					p.test();
					p.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	t1.start();
	t2.start();
}
}
