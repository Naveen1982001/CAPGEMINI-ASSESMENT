
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("enter the =");	
		int c=var.next().charAt(0);	
		int a = 6;
		int b = 4;
		 	
	switch(c)
	{
		case '+': 
			c= a + b;
			System.out.println(c); 
		break;
	
		case '-': 
			c= a - b;
			System.out.println(c);
		break;
		
		case '*': 
			c= a * b;
			System.out.println(c);
		 break;
		
		case '/': 
			c= a / b;
			System.out.println(c);
		break;
		
		default:
			System.out.println("Invalid operator");
	
	}
		
	}

}
