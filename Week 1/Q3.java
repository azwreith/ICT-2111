import java.io.*;
import java.util.Scanner;

public class Q3{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int flag;
		System.out.print("Enter n (from 2): ");
		int n = sc.nextInt();
		System.out.print("Enter m: ");
		int m = sc.nextInt();
		for(int i=n; i<=m; i++) {
			flag = 1;
			for(int j=2; j<=(i/2); j++) {
				if(i%j == 0) {
					flag = 0;
					break;
				}
			}
			if(flag == 1)
				System.out.print(i + " ");
		}
	}
}