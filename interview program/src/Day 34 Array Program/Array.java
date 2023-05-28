package com.cg.array;

public class Array {

	public static void main(String[] args)
	{
			int i;
			int a [] = {1,2,3,4,5,6};
			 	for(i=0;i<a.length;i++)	
			 {
			 		int b[]= {1,2,3,4,5,6};
			 			for(int j=0;j<b.length;j++)
			 			{
			 				int c=a[i]+b[j];
			
			 				if (c==6)
			 				{
			 					System.out.println( "this number is adding the six =" +c);
			 				}			
			 			}
			 }
	}

}
