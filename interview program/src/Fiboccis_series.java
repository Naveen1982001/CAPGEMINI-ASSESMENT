
public class Fiboccis_series {

	public static void main(String[] args) {
		int a=0,b=1,c=0,n=50;
		
		if(n==1)
		{
			System.out.print(a);		
		}
		else
		{
			System.out.print(a+" , ");
			System.out.print(b+" , ");
			
			for(int i=1;i<=n;i++)
			{
				c=a+b;
				System.out.print(c +" , ");
				a=b;
				b=c;			
			}
			
		}

	}

}
