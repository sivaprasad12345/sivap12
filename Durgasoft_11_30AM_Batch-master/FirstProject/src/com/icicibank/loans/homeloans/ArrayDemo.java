package com.icicibank.loans.homeloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public int m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int asize = sc.nextInt();
		int a[]=new int[asize];
		int sum=0;
		
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		//System.out.println("Sum of Array Is :" + sum);
		return sum;	
	}
	
	public static void main(String[] args) 
	{
				ArrayDemo obj=new ArrayDemo();
				int count = obj.m1();
				System.out.println("Count of Array :" + count);
	}

}
