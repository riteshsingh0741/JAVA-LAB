package lab1;
// WAP in java to take an array using user inputs(minimum 6 elements), and find the sum of elements till reduced to a single digit. Then test whether the sum is ever or odd.
// a.Test case1 =[12,10,15,19,20,21] , sum = 97, singledigitsum = 7, it is odd.
// b.Test case2 =[51,50,55,1,12,100] , sum =269, singledigitsum = 8, it is even.
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int arr[] = new int[6];
		int sum = 0;
		for(int i=0;i<6;i++)
		{
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		while(sum > 9)
		{
			int value = sum;
			int val = 0;
			while(value > 0)
			{
				val += value % 10;
				value /=10;
			}
			sum = val;
		}
		String check = "";
		if(sum % 2 == 0)
		{
			check = "even";
		}
		else
		{
			check = "odd";
		}
		System.out.println("The Single digit sum is : "+sum);
		System.out.print("It is "+check);
	}

}
