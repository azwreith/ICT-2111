package ujjlab7;

import java.util.Scanner;

class SquareMatrixException extends Exception {
    @Override
    public String toString() {
        return "Not a Square Matrix!";
    }
}

class ImaginaryRootException extends Exception {
    @Override
    public String toString() {
        return "Root is imaginary";
    }
}

public class Q4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("1. Square Matrix Validation");
        System.out.println("2. Check for negative root of a number");
        int c = sc.nextInt();
        if(c==1) {
            try {
                System.out.println("Enter order: ");
                int m = sc.nextInt();
                int n = sc.nextInt();
                if(m!=n)
                    throw new SquareMatrixException();
                else
                    System.out.println("Square Matrix");
            } catch(SquareMatrixException e) {
                System.err.println(e); 
            }
        }
        else if(c==2) {
            try {
                System.out.println("Enter no: ");
                int x = sc.nextInt();
                if(x < 0)
                  throw new ImaginaryRootException();
                else
                    System.out.println("Root: " + Math.sqrt(x));
            } catch(ImaginaryRootException e) {
                System.err.println(e);
            }
        }
    }
}