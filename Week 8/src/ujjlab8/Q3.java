package ujjlab8;

class MyThread3 extends Thread {
    @Override
    public void run() {
        for(int i=3; i>0; i--) {
            System.out.println("Terminating in: " + i);
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            MyThread3 t = new MyThread3();
            t.start();
            System.out.println(t.isAlive());
            t.join();
            System.out.println(t.isAlive());
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}