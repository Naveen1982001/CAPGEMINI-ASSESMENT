package com.cg.recursion;

///Factorial of number with using Recursion
public class Recusion {
	
	public  static int recursion(int num)
	
	{
	 
	    if(num==0||num==1)
	    {
	      return 1;
	    }
	    else
	    {
	    	return num * recursion (num-1);    	
	    }
	    
}

	public static void main(String[] args) {
		    int x = recursion(13);	    
		    System.out.println(x);
		    
	}

}
