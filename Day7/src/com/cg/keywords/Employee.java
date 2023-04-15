package com.cg.keywords;

public class Employee {
   public int id;
   private String name;
   static String companyName="GOOGLE";

public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



public static String getCompanyName() {
	return companyName;
}


public static void setCompanyName(String companyName) {
	Employee.companyName = companyName;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ",companyName=" + companyName+ "]";
}


}
