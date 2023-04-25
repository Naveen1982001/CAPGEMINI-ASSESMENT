package com.cg.class_main;



public class Note {
	
	int cost = 40;
	static String  notesize ="longsize_ Note";
	String  notetype="Ruled_Note";
	
	public void write()
	{
		System.out.println("we can write in the note");
	}

	static void tearing()
	{
		System.out.println("we can tearing the note papers");
	}

	public static void main(String[] args) {
			Note n1=new Note();
			System.out.println("The NOTE cost is:"+n1.cost); //IT IS NON STATIC DATA MEMBER.
			System.out.println("The NOTE Type is :"+n1.notetype);//IT IS NON STATIC DATA MEMBER.
			System.out.println("The NOTE Size  is :"+n1.notesize);  // it is Static Data member.
			
			
			n1.write();//IT IS NON STATIC FUNCTION MEMBER.
			n1.tearing();// it is Static function member.
		
	}
	
}
