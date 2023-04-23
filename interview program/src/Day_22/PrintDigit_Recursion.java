package com.cg.recursion;

public class PrintDigit_Recursion {

 static void recursion(int num)
	{
	   if (num<=100)
	   {		   
		   System.out.println("it"+num);
		   num++;
		   recursion(num);
	   }	
	}
		
	public static void main(String[] args) {
		
		recursion(1);
	}

}
