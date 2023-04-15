
public class Method_Switch {

	 static int condition(int a,int b)
	 {
		int c=0;
	   
		switch(2)
	   {
	   case 1:
		   c=a+b;
		   System.out.println(c);
		   break;
	   case 2:
		   c=a-b;
		   if(a>b) 
		   {
			   System.out.println("a is greater");
		   }
			else
		   {		   
			   System.out.println("b is greater");
		   }	   
		   System.out.println(c);
		   break;
	   case 3:
		   c=a*b;
		   System.out.println(c);
		   break;   
	  
	   default :
		   System.out.println("It is Invalid number");	  
	   }
		return c; 
	 }
	
	public static void main(String[] args) {
		
	  condition(0,10);

	}

}
