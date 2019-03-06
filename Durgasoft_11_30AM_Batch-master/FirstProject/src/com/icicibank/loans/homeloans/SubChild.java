package com.icicibank.loans.homeloans;

public class SubChild extends ArrayDemo
{
	public void m2()
	{
		System.out.println("iam m2 from Sub Child");
	}

	public static void main(String[] args) 
	{
		SubChild obj1=new SubChild();
		obj1.m2();
		obj1.m1();

	}

}
