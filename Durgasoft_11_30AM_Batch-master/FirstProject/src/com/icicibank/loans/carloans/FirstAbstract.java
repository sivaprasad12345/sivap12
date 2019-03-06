package com.icicibank.loans.carloans;

public abstract class FirstAbstract 
{
	
	public void m1()
	{
		System.out.println("iam m1 concrete from FirstAbstarct");
	}
	
	public abstract void m2();

	public static void main(String[] args) {
		FirstAbstract obj;
		
		obj=new ChildClass();
		obj.m1();
		obj.m2();
		
	}

}
