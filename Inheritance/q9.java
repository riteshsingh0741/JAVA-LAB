package inheritance;

public class q9 { 
	 public static void main(String[] args) {  
	  // invoke method and collect array 
		 Get2 g = new Get2();
		 int[] arr = g.array();
		 
		 for(int ele : arr)
		 {
			 System.out.print(ele + " ");
		 }
	 } 
} 
	
class Get2{ 
	 public int[] array(){ 
		 int[] x = {10, 20, 30, 40, 50}; 
		 return x; 
	 } 
} 

