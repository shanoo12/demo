package com.example.demo;
class A{
	public void testPrint()
	{
		display();
	}
	public void display()
	{
		System.out.println("Class A");
	}
}
class B extends A{
	
	public void display()
	{
		System.out.println("Class b");
	}
}
public class Test {
	public static void main(String[] args) {
		A a=new B();
		a.testPrint();
		a.display();
		B b=(B)a;
		b.testPrint();
		b.display();
	}

}
