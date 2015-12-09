import java.io.*;
import java.util.Scanner;

public class Q4	{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[20][20];
		int b[][] = new int[20][20];
		int c[][] = new int[20][20];
		System.out.print("Enter the size of A: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.print("Enter the size of B: ");
		int o = sc.nextInt();
		int p = sc.nextInt();
		if(n!=o) {
			System.out.println("Not multiplicable!");
			System.exit(0);
		}
		System.out.println("Enter the elements of A!");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++)
				a[i][j] = sc.nextInt();
		}
		System.out.println("Enter the elements of B!");
		for(int i=0; i<o; i++) {
			for(int j=0; j<p; j++)
				b[i][j] = sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<p; j++) {
				c[i][j]=0;
				for(int k=0; k<n; k++)
					c[i][j]+= a[i][k]*b[k][j]; 
			}
		}
		for(int i=0; i<m; i++) {
			System.out.println();
			for(int j=0; j<p; j++)
				System.out.print(c[i][j]+ " ");
		}
	}
}