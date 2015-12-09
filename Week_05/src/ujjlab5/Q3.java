package ujjlab5;

class Bank {
    int rate;
    Bank(int n) {
        rate=n;
    }
    void display() {
        System.out.println(rate + "%");
    }
}
class SBI extends Bank {
    SBI(int n) {
        super(n);
    }
    @Override
    void display() {
       System.out.println("SBI");
       super.display();
    }
}
class ICICI extends Bank {
    ICICI(int n) {
        super(n);
    }
    @Override
    void display() {
        System.out.println("ICICI");
        super.display();
    }
}
class AXIS extends Bank {
    AXIS(int n) {
        super(n);
    }
    @Override
    void display() {
        System.out.println("AXIS");
        super.display();
    }
}

public class Q3 {
    public static void main(String args[]) {
        SBI s=new SBI(8);
        ICICI i=new ICICI(7);
        AXIS a=new AXIS(9);     
        s.display();
        i.display();
        a.display();
    }
}