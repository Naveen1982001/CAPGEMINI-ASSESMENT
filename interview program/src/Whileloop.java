package com.cg.sample;

public class Whileloop {

	public static void main(String[] args) {
		int i=1; int sum=0;
		
		while( i <=10)
		{
			sum=sum+i ;
			i++;
			
			if(sum%2==0) 
			{
					System.out.println(sum + "it is even ");
			 }
			else
			{
				System.out.println(sum+ "it is not even");
			}
			
		}

	}


}
