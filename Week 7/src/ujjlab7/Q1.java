package ujjlab7;

public class Q1 {
    public static void main(String[] args) {
        try {
            String s = "Ujj";
            Integer i = Integer.parseInt(s);
        } catch(NumberFormatException e) {
            System.err.println(e);
        }
    }
}