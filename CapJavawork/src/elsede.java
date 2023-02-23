
public class elsede {

	public static void main(String[] args) {
		int a =10,b=20,c=5;
		System.out.println("larger");
		
		if(a>b) {
			if(a>c)
				System.out.print(a);
			else
				System.out.print(c);
		}
		else {
			if(c>b)
				System.out.print(c);
			else
			    System.out.print(b);
		}
	  
	}

}
