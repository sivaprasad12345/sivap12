package com.icicibank.loans.carloans;

public class B extends A
{
	
	
	
	void m2()
	{
		System.out.println("iam m2 in class B");
	}

	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
		
		B b=new B();
		b.m2();
		b.m1();
		System.out.println(b.x);

	}

}
