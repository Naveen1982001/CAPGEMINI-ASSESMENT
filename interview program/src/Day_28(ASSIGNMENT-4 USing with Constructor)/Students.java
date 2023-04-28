package com.cg.students;

public class Students {
	 int student_id;
	 String student_name;
     int  sub1;
     int  sub2;
     int  sub3;

     Students(int id,String name,int mark1,int mark2,int mark3)
     {
    	 student_id =id;
    	 student_name=name;
         sub1=mark1;
         sub2=mark2;
         sub3 =mark3; 	 
     }
   
      public int average ( int sub1, int sub2,int  sub3)
      {
    	  int avg=0;
    	  avg=sub1+sub2+sub3/3;
    	  System.out.println("The student id is : " + student_id);
          System.out.println("Student name is :"+ student_name);
    	  System.out.println("It is Average Of Student Three Subject Mark is : "+ avg );
    	  
    	  if ( avg>=55)
  	  	{
      	  System.out.println("This student is Pass");
  	  	}
  	  else 
  	  	{
      	 System.out.println("This student is Fail");
      	}
        
    	  return avg;       
      }   
      
  
     public static void main(String[] args) {
		    	 
    	 Students s1=new Students( 1, "Naveen",60,62,56)  ;	
    	 s1.average(60,62,56);
    	 System.out.println(" --------------------------------------------------------------------------------------");
    	 Students s2=new Students( 2, "Yokesh",70,80,73)  ;	
    	 s2.average(70,80,73);
    	 System.out.println(" --------------------------------------------------------------------------------------");
    	 Students s3=new Students( 3, "Name 3",30,20,13)  ;	
    	 s3.average(30,20,13);
	}

}
