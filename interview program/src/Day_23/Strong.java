
public class Strong {

	public static void main(String[] args) {
    
		 int num=145;int rem=0;int fact =1;	int sum=0;int temp=num;
		 
		 while(num>0)
		 {
			 rem=num%10;
			
			 int i=1;
			 while(i<=rem)	
			 {
				 fact=fact*i;
				 i++;
			 }			 
			 sum=sum+fact;
			 num=num/10;			 			 
		 }
		 if(sum==temp)
			{
				System.out.println("it is strong" + fact);
			}
			
			else
			{
				System.out.println("Not a strong" +fact);
			}
	}
}

