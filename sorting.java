package lab1;
// Sorting (Bubble/Insertion) a list of numbers using one dimensional array.
import java.util.Scanner;
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {2,3,1,4,7,14,12,10,17,8};
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(array[i]>array[j])
				{
					int num = array[i];
					array[i] = array[j];
					array[j] = num;
				}
			}
		}
		System.out.print("Sorted array : ");
		for(int i=0;i<10;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
