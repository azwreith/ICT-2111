import java.io.*;
import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int mult = sc.nextInt();
		int div = mult;
		System.out.println("Multiplying: " + (mult<<1));
		System.out.println("Dividing: " + (div>>1));
	}
}