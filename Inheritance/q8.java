package inheritance;

public class q8 { 
	 public static void main(String[] args) {  
		 int[] x = {10, 20, 30, 40, 50}; 
	  // invoke method 
		 Print1 p = new Print1();
		 p.array(x);
	 } 
} 
	
class Print1{ 
	 public void array(int[] arr){ 
	  // display values using for-each 
		 for(int y : arr)
		 {
			 System.out.print(y+" ");
		 }
	 }
} 


