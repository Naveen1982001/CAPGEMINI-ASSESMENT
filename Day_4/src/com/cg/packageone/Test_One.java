package com.cg.packageone;

public class Test_One {
	 public int i=10;
	
	 public void show() {
		 System.out.println("Show Method");	 
	 }
	 public static void main(String[] args) {
		 Test_One t1=new Test_One();
		 t1.show();
		 System.out.println(t1.i);
	}
}
