import java.io.*;
import java.util.Scanner;

public class Q3	{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[20][20];
		System.out.print("Enter the size: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m!=n) {
			System.out.println("Not symmetric!");
			System.exit(0);	
		}
		System.out.println("Enter the elements!");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++)
				a[i][j] = sc.nextInt();
		}
		System.out.println();
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j]!=a[j][i]) {
					System.out.println("Not symmetric!");
					System.exit(0);			
				}
			}
		}
		System.out.println("Symmetric!");
	}
}