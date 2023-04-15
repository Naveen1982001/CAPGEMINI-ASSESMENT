
public class Star_Pattern_With_Pramid {

	public static void main(String[] args) {
		int i,j,s;
		for(i=1;i<=5;i++) 
		{
		for (j=1;j<=5-i;j++)
 		{
 		  System.out.print("     ");
 		 }
		for(j=1;j>=i;j++)
		{
			System.out.print(j+"  ");
		}
	     
		System.out.println();
		
		}
	}
}
