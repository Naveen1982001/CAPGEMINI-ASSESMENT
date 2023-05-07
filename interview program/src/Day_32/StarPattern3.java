package com.cg.assignment7;

public class StarPattern3 {

	public static void main(String[] args) {
		char ch ='A';
		
		for (int j=1;j<=5;j++)  //column
		{
		for(int i=1;i<=j;i++) //row
		{
			System.out.print(ch+"  ");
		}
		  System.out.print(" ");	
		  System.out.println(" ");
		  ch++;
		}
	}

}
