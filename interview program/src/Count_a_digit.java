package com.cg.sample;

public class Count_a_digit {
	
	
	public static int digit(long num)
	  {
		short count=0;
		while( num>0) 
		{
		  count++;
		  num=num/10;
		}
	     return count;	
	  }
	public static void main(String[] args) {
		
		System.out.println(digit(14213879));

	}

}
