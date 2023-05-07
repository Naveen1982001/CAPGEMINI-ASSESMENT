package com.cg.assignment7;

public class StarPattern2 {

	public static void main(String[] args) {
	         
	            char ch='A';
	            
	            for( int j=1;j<=4;j++) //column
					{
						for (int i=1;i<=j;i++)	 	//row	
						{
							System.out.print(ch+"  ");				       
							ch++;		
						}
						System.out.println("  ");		
						}
	}
}
