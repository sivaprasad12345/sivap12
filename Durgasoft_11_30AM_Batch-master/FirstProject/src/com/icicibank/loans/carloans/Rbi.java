package com.icicibank.loans.carloans;

public interface Rbi 
{
	public abstract void withdrawl();
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i=new Rbi();
		
		Rbi i;
		
		i=new Icici();
		i.withdrawl();
		i.deposit();
		
		i=new Hdfc();
		i.withdrawl();
		i.deposit();
		
		
	}
	
}
