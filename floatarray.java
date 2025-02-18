package lab1;
//Create an array of 5 floats and calculate their sum.
import java.util.Scanner;
public class floatarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	float[] arr = new float[5];
	float sum = 0;
	
	System.out.println("Enter the value : ");
	for(int i=0;i<5;i++)
	{
		arr[i] = sc.nextFloat();
		sum = sum + arr[i];
	}
	System.out.print("The Sum of all elements of array is "+sum);
	}

}
