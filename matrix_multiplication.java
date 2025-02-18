package lab1;
//WAP in java to illustrate matrix multiplication using 2D array taking the dimension from keyboard.
import java.util.Scanner;
public class matrix_multiplication {

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the row and colum of first matrix : ");
			int m = sc.nextInt();
			int n = sc.nextInt();
			int [][]array1=new int[m][n];
			System.out.println("Enter the elements of first matrix : ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					array1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the row and colum of second matrix : ");
			int p = sc.nextInt();
			int q = sc.nextInt();
			int [][]array2=new int[p][q];
			System.out.println("Enter the elements of second matrix : ");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					array2[i][j]=sc.nextInt();
				}
			}
			if(n!=p) {
				System.out.println("Not possible");
				return ;
			}
			int [][] result=new int[m][q];
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					int sum=0;
					for(int it=0;it<n;it++) {
						sum+=array1[i][it]*array2[it][j];
					}
					result[i][j]=sum;
				}
			}
			for(int i=0;i<m;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
		}
	}