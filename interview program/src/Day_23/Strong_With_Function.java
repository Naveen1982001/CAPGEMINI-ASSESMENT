
public class Strong_With_Function {
	

	
	public static int factorial(int rem)
	{
		int fact=1;
		for(int i=1;i<=rem;i++)
		{
			 fact=fact*i;
		}
		return fact;
	}
	
	public static void strong (int num)	
	{
		int rem=0;int fact =1;int temp=num;int sum=0;
		
		while(num>0)
		 {
			 rem=num%10;				  
			 sum=sum+factorial(rem);
			 num=num/10;			 			 
		 }
		
		if (sum==temp)
		{
			System.out.println("it is strong  : "+sum);
		}
		else 
		{
			System.out.println("Not strong  :"+sum);
		}
		
		
	}
	
	public static void main(String[] args) {
		 
		strong(145);

	}

}
