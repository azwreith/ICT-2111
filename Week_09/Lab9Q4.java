package ujjlab9;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s1 = sc.nextLine();
    	String s2 = sc.nextLine();
    	int c;
    	while(true) {
    		System.out.println("1. Compare two strings");
    		System.out.println("2. Convert U2L & L2U");
    		System.out.println("3. Is second sub of first");
    		System.out.println("4. Replace substring occurances");
    		System.out.println("Any other no. to exit..");
    		c = sc.nextInt();

    		switch(c) {
    		case 1: System.out.println(s1.compareTo(s2));
    				break;
    		case 2: for(char a:s1.toCharArray())
    					if(Character.isUpperCase(a))
    						System.out.print(Character.toLowerCase(a));
    					else System.out.print(Character.toUpperCase(a));
    				System.out.println();
    				break;
    		case 3: System.out.println(s1.indexOf(s2)!=-1);
    				break;
    		case 4: System.out.println(s1.replaceAll(s2, "Hello"));
    				break;
    		default: System.exit(0);
    		}
    	}
    }
}
