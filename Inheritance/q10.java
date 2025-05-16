package inheritance;

public class q10{ 
	 public static void main(String[] args) 
	 { 
		 Employee e1 = new Employee("Amar", "Hyderabad"); 
		 Display.details(e1); 
	 } 
} 
	
class Display{ 
	 public static void details(Employee e2) 
	 { 
		 System.out.println("Details are : " + e2); 
	 } 
} 
	
class Employee{ 
	 private String name, location; 
	 public Employee(String name, String location) 
	 { 
		 this.name = name; 
		 this.location = location; 
	 } 
	 
public String toString(){ 
	  	return this.name + ", " + this.location; 
	 } 
} 

