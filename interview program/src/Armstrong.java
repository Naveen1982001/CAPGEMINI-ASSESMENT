package com.cg.sample;

public class Armstrong {

	public static void main(String[] args) {
			int num=153;
			int sum=0;                                                                                                                              
		  	int temp=num;
		  	while(num>0)
		{		
			
		  	int rem=num%10;
			rem=(int) Math.pow(rem,3);
			sum=sum+rem;
			num=num/10;
					
		}
		if(sum==temp)
		{
			System.out.println(sum+ " = It is Armstrong number");
		}
		else {
			System.out.println(sum +" = Not Armstorng Num");
		}
	}

}
