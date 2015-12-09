package ujjlab8;

class MyThread4 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println(this.getName() + " priority: " + this.getPriority());
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        MyThread4 a = new MyThread4();
        a.setPriority(Thread.MAX_PRIORITY);
        MyThread4 b = new MyThread4();
        b.setPriority(Thread.MIN_PRIORITY);
        a.start();
        b.start();
    }
}
