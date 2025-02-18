package lab1;
import java.util.Scanner;
public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n,p,r;
		Scanner sc = new Scanner(System.in);

		System.out.print("Principle is:");
		p = sc.nextFloat();
		System.out.print("Enter rate of interest:");
		r = sc.nextFloat();
		System.out.print("Enter the no. of years:");
		n = sc.nextInt();
		double val=1+r/100;
		System.out.print("The total interest is : "+(p*Math.pow(val, n)));
	}

}
