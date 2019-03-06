package com.icicibank.loans.homeloans;

import com.icicibank.loans.carloans.A;

public class C extends A
{
	
	void m3()
	{
		System.out.println("iam m3 in class C");
	}

	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
		
		C c=new C();
		c.m3();
		c.m1();
		System.out.println(c.x);
	}

}
