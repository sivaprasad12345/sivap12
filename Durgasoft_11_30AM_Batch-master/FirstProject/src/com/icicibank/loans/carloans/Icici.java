package com.icicibank.loans.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i=new Icici();
		i.withdrawl();
		i.deposit();

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("Iam overridden withdrawl in ICICI");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("Iam overridden deposit in ICICI");
		
	}

}
