package com.cg.zoho;

public class Employee {
		  final int id;
          String name;
          static double salary;
          
          Employee(int id,String name,double salary)
          {
        	  this.id=id;
        	  this.name=name;
        	  this.salary=salary;
          }
         
           static double Homeallowance()
          {
        	  double hra= salary*(25.0/100);      	  	 
        	  return hra;
          }
         
          static double taxdeductedSource()
          {
        	  double tds = (8.0/100)*(salary*12);
              return tds;
          }
          
           static double costofcompany()
          {  	  
        	  double ctc=salary+taxdeductedSource()+Homeallowance();     	  
        	  return ctc;      	  
          }
         
           void display()
          {       	  
        	  System.out.println(id+"\t"+"\t"+  name +"\t"+"\t"+ Homeallowance()  +"\t"+"\t"+taxdeductedSource()+"\t"+"\t"+costofcompany());
          }
	public static void main(String[] args) {
		System.out.println("ZOHO EMPLOYEE MANAGEMENT DATA ");
		System.out.println("");
		System.out.println("ID"+"\t"+"\t"+"NAME"+"\t"+"\t"+"HRA"+"\t"+"\t"+"\t"+"TDS"+"\t"+"\t"+"\t"+"CTC");    
		 
		Employee h1=new Employee(1,"Naveen",50000.0);		
		 h1.display();
		 Employee h2=new Employee(2,"Yokesh",40000.0);		
		 h2.display();
		 Employee h3=new Employee(3,"Name3",100000.0);		
		 h3.display();
		 Employee h4=new Employee(4,"Name4",30000.0);		
		 h4.display();
		 Employee h5=new Employee(5,"Name5",70000.0);		
		 h5.display();
	}

}
