package ujjlab7;

public class Q2 {
    public static void main(String[] args) {
        int[] i = new int[10];
        try {
            i[25] = 1;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}