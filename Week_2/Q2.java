import java.io.*;
import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an int number: ");
		int inum = sc.nextInt();
		System.out.print("Enter a double number: ");
		double dnum = sc.nextDouble();
		System.out.print("Enter a char: ");
		char charac = sc.next().charAt(0);
		System.out.println("int to byte: " + (byte)inum);
		System.out.println("char to int: " + (int)charac);
		System.out.println("double to byte: " + (byte)dnum);
		System.out.println("double to int: " + (int)dnum);
	}
}