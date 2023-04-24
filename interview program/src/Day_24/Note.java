package com.cg.oops;

public class Note extends Adapter{
	
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

}
