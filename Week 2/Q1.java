import java.io.*;
import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();

		if(year%4 != 0)
			System.out.println("This is a common year!");
		else if(year%100 != 0)
			System.out.println("This is a leap year!");
		else if(year%400 != 0)
			System.out.println("This is a common year!");
		else
			System.out.println("This is a leap year!");
	}
}