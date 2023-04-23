package com.cg.recursion;

public class Reverse_Recursion {

	static void recursion(int num)
	{
	   if (num>0)
	   {		   
		   System.out.print(num%10);
		    recursion(num/10);
	   }	
	}
	
	
	public static void main(String[] args) {
		
       recursion(14214);
	}

}
