package com.cg.class_main;


public class Adapter 
{
			static String color="white" ;
							int  watts=33;
						String cost="free";
						
			static void phone_charging()
			{
				 int percentage =62;
				 System.out.println("Its is works to charge to phone  "+ percentage);
			    
			}
			void dataTransfer(int c,int v)
					{
				       String Transfering = "completed"; 
				       int q=c*v;   // formula for charging 
				      System.out.println("Its is works to data transfer through phone  "+Transfering);
				      System.out.println(" Charging I mulitply the two number with use function : "+q +"%");
					}
			
			
	public static void main(String[] args) {
		
				Adapter a1=new Adapter();
				System.out.println(a1.cost);//IT IS NON STATIC DATA MEMBER.
				System.out.println(a1.watts);//IT IS NON STATIC DATA MEMBER.
				System.out.println(a1.color); // it is Static Data member.
		       	
		             	
		       	a1.dataTransfer(20,4);//IT IS NON STATIC FUNCTION MEMBER.
		       	a1.phone_charging(); // it is Static function member.
	
		       	
		}
	}
