package ujjlab8;

public class Q2 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            new Thread() {
                @Override
                public void run() {
                    System.out.println("I'm a thread!");
                }
            }.start();
        }
    }
}