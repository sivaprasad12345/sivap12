package com.icicibank.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		
		StringBuffer str1=new StringBuffer("ravikanth");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		StringBuffer str2=new StringBuffer("lella");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		str1=str1.append(str2);
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		
		/*String str1="ravikanth";
		System.out.println(str1);
		System.out.println(str1.hashCode());
		
		String str2=new String("lella");
		System.out.println(str2);
		System.out.println(str2.hashCode());
		
		//str1=str1+str2;
		str1=str1.concat(str2);
		System.out.println(str1);
		System.out.println(str1.hashCode());*/
		
		

	}

}
