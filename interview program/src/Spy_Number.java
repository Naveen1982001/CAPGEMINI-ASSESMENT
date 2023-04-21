package com.cg.sample;

public class Spy_Number {
	
	   static int add( int num)
	   {
		   int sum=0;
		   while(num>0)
		   {
			   int rem=num%10;
			   sum=sum+rem;
			   num=num/10;			      
		   }
		  return sum;
	   }
	   static int product( int num)
	   {
		   int prod=1;
		   while(num>0)
		   {
			   int rem=num%10;
			   prod=prod*rem;
			   num=num/10;	   
		   } 	
		   return prod;
	}
	 
	   static boolean spynumber (int num)
	   {
		   int sum =add(  num);
		   int prod=product( num);
		   return(sum==prod);
	   }
	
	   public static void main(String[] args) {
	
		   int num=123;
		   add(num);
		   product(num);
		  
		if(spynumber ( num))
			{
				System.out.println("Both the answer are same so It is Spy");
			}
			else
			{
				System.out.println("Both the answer are Not same ");
			}                                                                                                                                                                                                                                                                                                                                                            
	  }
}

		
	 

