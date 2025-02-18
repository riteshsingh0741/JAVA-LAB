package lab1;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upp,low;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter lower limit:");
		low = sc.nextInt();
		System.out.print("Enter upper limit:");
		upp = sc.nextInt();
		System.out.print("Enter frequency :");
		int freq = sc.nextInt();
		int total=0;
		for(int i = low;i<=upp;i++)
		{
		int count = 0;
		for(int j = 2;j < i-1; j++)
		{
		if(i % j == 0)
		{
		count++;
		}
		}
		if(count == 0)
		{
		System.out.print(i+" ");
		total++;
		if(total==freq) {
			break;
		}
		}
		}

	}

}
