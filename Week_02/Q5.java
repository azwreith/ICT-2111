import java.io.*;
import java.util.Scanner;

public class Q5 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	float a, b;
	char op, proceed;
	do {
	System.out.print("Enter the expression of the form 3 * 2: ");
	a = sc.nextFloat();
    op = sc.next().charAt(0);
    b = sc.nextFloat();
	switch(op) {
		case '+':	System.out.println("Answer is: " + (a+b));
					break;
		case '-':	System.out.println("Answer is: " + (a-b));
					break;
		case '*':	System.out.println("Answer is: " + (a*b));
					break;
		case '/':	System.out.println("Answer is: " + (a/b));
					break;
		default :   System.out.println("Invalid Input!");
	}
	System.out.print("Do you wish to proceed? (y/n): ");
	proceed = sc.next().charAt(0);
	if(proceed == 'n')
		break;
	else if(proceed != 'y' || proceed != 'n')
		System.out.println("Invalid Input! Continuing...");
	} while(true);

	}
}