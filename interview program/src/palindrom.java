package com.cg.sample;

public class palindrom {

	public static void main(String[] args) {
			
		int i=121; int temp=i; int rev =0;
   	
           while(i>0)
           {
        	   int last=i%10;
        	   rev=(rev*10)+last;
        	   i=i/10;       	  
           }
           if(rev==temp)
    	   {
    		   System.out.println(temp +"palidrom");      
    	   }
    	   else
    	   {
    		   System.out.println(temp + "not palidrom");      
    	   }
	
	}

}


	     