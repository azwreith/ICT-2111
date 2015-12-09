import java.io.*;
import java.util.Scanner;

public class Q2	{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[20][20];
		System.out.print("Enter the size: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Enter the elements!");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++)
				a[i][j] = sc.nextInt();
		}
		System.out.println();
		int sum = 0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i==j || i+j==n-1)
					continue;
				System.out.print(a[i][j] + " ");
				sum+=a[i][j];
			}
		}
		System.out.println();
		System.out.println("Sum is: " + sum);
	}
}