package com.cg.recursion;

public class Counting_Number_Recursion {

	static void recursion(int num)
	{
		int count=0;
	   if (num>=0)
	   {		   
		  count++;
		   System.out.println(count);
		   num=num/10;
		   recursion(num);
	   }
	   else
	   {
		   System.out.println();
	   }
	}
	
	
	public static void main(String[] args) {
		
       recursion(14214);
	}

}


