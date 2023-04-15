
public class constructorDemo {

	public static void main(String[] args) {
	   Customer c1 =new Customer();
	   
	   c1.setCustomerid(1);
	   c1.setCustomername("naveen");
	   c1.setCustomercity("chennai");
	   
	   System.out.println(c1.getCustomerid());
	   System.out.println(c1.getCustomername());
	   System.out.println(c1.getCustomercity());
	   
	        //or///////////////////////////////////////////////////////////////
	   
	   System.out.println(c1);

	}

}
