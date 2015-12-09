import java.io.*;
import java.util.Scanner;

public class Q5	{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[20][20];
		int sum=0, sum1=0, sum2, flag=1;
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements!");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				a[i][j] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			sum+=a[i][i];
		}
		for(int i=0; i<n; i++) {
			sum1+=a[i][n-i-1];
		}
		if(sum1!=sum)
			flag=0;
		for(int i=0;i<n;i++) {
			sum1=0;
			sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=a[i][j];
				sum2+=a[j][i];
			}
			if(sum1!=sum || sum2!=sum) {
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("Magic Square!");
		else
			System.out.println("Not a Magic Square!");
	}
}