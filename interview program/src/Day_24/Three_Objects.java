package com.cg.oops;

public class Three_Objects extends Adapter{

	public static void main(String[] args) {
		Adapter a1=new Adapter();
		Note n1=new Note();
		Bag b1=new Bag();

	 System.out.println("The ADAPTER color is:"+a1.color);
	 System.out.println("The ADAPTER taking watts is :"+a1.watts);
	 System.out.println("The ADAPTER cost  is :"+new Adapter().cost);
	 a1.dataTransfer();
	 a1.phone_charging();
	 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++()++++++++++++++");
	
	 System.out.println("The NOTE cost is:"+n1.cost);
	 System.out.println("The NOTE Type is :"+n1.notetype);
	 System.out.println("The NOTE Size  is :"+new Note().notesize);
	 n1.write();
	 n1.tearing();
	 
	 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++()++++++++++++++");
      
	 System.out.println("The BAG cost is:"+b1.bagcost);
	 System.out.println("The BAG color is :"+b1.bagcolor);
	 System.out.println("The BAG Name   is :"+new Bag().bagname);
	 b1.things();
	
	}

}
