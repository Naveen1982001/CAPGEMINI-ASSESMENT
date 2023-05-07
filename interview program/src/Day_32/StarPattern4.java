package com.cg.assignment7;

public class StarPattern4 {
	
	public static void main(String[] args) {
        char ch = 'A';
        
        for (int j = 1; j <= 5; j++) 
        {          
        	for (int i = 1; i <= 5 - j; i++) 
        	{
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * j - 1; k++) 
            {
                System.out.print(ch);
                if (k < j) {
                    ch++;
                } 
                else {
                    ch--;
                }
            }
            System.out.println();
             ch='A';
        }
    }
}


