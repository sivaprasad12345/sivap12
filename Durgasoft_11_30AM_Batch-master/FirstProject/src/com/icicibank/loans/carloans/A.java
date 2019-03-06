package com.icicibank.loans.carloans;

import java.util.Date;

public class A 
{
	public int x=100;
	static Date dt;
	
	static
	{
		dt=new Date();
		System.out.println(dt);
	}
	
	public void m1()
	{
		System.out.println("iam m1 in class A");
		System.out.println(dt);
	}
	
	

	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);

	}

}
