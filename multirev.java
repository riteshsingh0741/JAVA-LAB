package lab1;
// WAP in java 
import java.util.Scanner;
public class multirev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		for(int i=10;i>0;i--)
		{
			System.out.println(num+ " X " + i + " = " + (num*i));
		}
	}

}
