package com.cg.keywords;

public class MyClass  {

	private static int section;
	private static int regno;
	
	static {
		System.out.println("staic block");
		regno=56;
		section=2;
	}
	MyClass()
	{
		System.out.println("Constructor block");
		regno++;
		section++;
	}
	void display()
	{
		System.out.println(section);
		System.out.println(regno);
	}
	public static void main(String[] args) {
	
		MyClass m1=new MyClass();
		m1.display();		
	}
}

