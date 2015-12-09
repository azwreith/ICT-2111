import java.io.*;
import java.util.Scanner;

public class Q1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length, width, area, circumference;
		System.out.print("Enter the length: ");
		length = sc.nextInt();
		System.out.print("Enter the width: ");
		width = sc.nextInt();
		area = length * width;
		circumference = 2*(length+width);
		System.out.println("Area is : " + area);
		System.out.println("Circumference is : " + circumference);
	}
}