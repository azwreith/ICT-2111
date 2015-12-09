package ujjlab7;

import java.util.Scanner;
public class Q3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name, roll, marks[] = new String[3];
        Integer grade = 0;
        try {
            name = sc.next();
            roll = sc.next();
            for(int i =0; i < marks.length; i++) {
                marks[i] = sc.next();
                grade += Integer.parseInt(marks[i]);
            }
            System.out.println((grade/=3) + "%");
        } catch(NumberFormatException e) {
            System.err.println(e);
        }
    }
}
