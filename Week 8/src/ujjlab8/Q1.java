package ujjlab8;
import java.util.Scanner;

class MyThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("I extend Thread!");
    }
}

class MyThreadB implements Runnable {
    @Override
    public void run() {
                System.out.println("I implement Runnable!");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        while(true) {
            System.out.println("1. Create thread by extending Thread");
            System.out.println("2. Create thread by implementng Runnable");
            System.out.println("3. Exit");
            a = sc.nextInt();
            
            switch(a) {
            case 1: 
                new MyThreadA().start();
                break;
            case 2:
                new Thread(new MyThreadB()).start();
                break;
            case 3:
                System.exit(0);
            }
        }
    }    
}
