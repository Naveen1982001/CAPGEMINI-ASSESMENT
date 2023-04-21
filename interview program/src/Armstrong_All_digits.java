package com.cg.sample;

public class Armstrong_All_digits {
	
	static void isArmstrong(int num)
	{
		int temp=num;
		int count=0;
		//logic to count number of digits
		
		int x=num;
		while(x>0)
		{
			count++;
			x=x/10;
		}
		//Armstrong logic
		
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			//multiply remainder based on total no of digits
			
			//here count is stored counted of digit before on( x )
			int res=1;
			for(int i=1;i<=count;i++)
			{
				res=res*rem;
			}
			sum=sum+res;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" = Armstrong");
		}
		else 
		{
			System.out.println(sum+" = it is not Armstrong");
		}
	}

	public static void main(String[] args) {
		
      isArmstrong(1634);
	}

}
