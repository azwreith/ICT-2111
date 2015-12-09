package ujjlab9;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	int c;
    	while(true) {
    		System.out.println("1. Check if palindrome");
    		System.out.println("2. Write in alphabetical order");
    		System.out.println("3. Reverse the string");
    		System.out.println("4. Concatenate original & reversed");
    		System.out.println("Any other no to exit..");
    		c = sc.nextInt();

    		switch(c) {
    		case 1: System.out.println(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()));
    				break;
    		case 2: char[] a = s.toCharArray();
    				Arrays.sort(a);
    				System.out.println(a);
    				break;
    		case 3: System.out.println(new StringBuilder(s).reverse().toString());
    				break;
    		case 4: System.out.println(s + new StringBuilder(s).reverse().toString());
    				break;
    		default: System.exit(0);
    		}
    	}
    }
}
