package com.cg.class_main;



public class Bag {

		String bagcolor="grey";
		int bagcost=1000;
		static String bagname="Safari";
		
		static void things()
		{
			System.out.println("We can hold the things inside the bags");
		}
	
	
	public static void main(String[] args) {
		 Bag b1=new Bag();
		 System.out.println("The BAG cost is:"+b1.bagcost);   //IT IS NON STATIC DATA MEMBER.
		 System.out.println("The BAG color is :"+b1.bagcolor);//IT IS NON STATIC DATA MEMBER.
		 System.out.println("The BAG Name   is :"+ b1.bagname);// it is Static Data member.
		
		 b1.things();// it is Static function member.

}

}
