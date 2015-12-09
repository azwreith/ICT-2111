package ujjlab5;

import java.util.Scanner;

class Account {
    double balance;
    
    public Account(double balance, String name, String type, int accNo) {
        this.balance = balance;
        this.name = name;
        this.type = type;
        this.accNo = accNo;
    }
    String name, type;
    int accNo;
    public void displayBal() {
        System.out.println("Your new balance is: " + balance);
    }
    public void deposit(double amt) {
        balance+=amt;
        displayBal();
    }
}

class Savings extends Account {
    static double interestRate = 0.1;

    public Savings(double balance, String name, int accNo) {
        super(balance, name, "Savings", accNo);
    }
    public void withdraw(double amt) {
        if(balance<amt) {
            System.out.println("Insuficient Balance!");
            return;
        }
        balance-=amt;
        System.out.println("Your new balance is: " + balance);
    }
    public void computeInterest() {
        balance+=balance*interestRate;
        displayBal();
    }
    
}

class Current extends Account {
    static double minBal = 1000.0, penalty = 0.1; 
    public Current(double balance, String name, int accNo) {
        super(balance, name, "Current", accNo);
    }
    public void withdraw(double amt) {
        if(balance<amt) {
            System.out.println("Insuficient Balance!");
            return;
        }
        balance-=amt;
        displayBal();
        if(balance<minBal)
            penalty();
    }
    private void penalty() {
        balance-= balance*penalty;
        System.out.println("You are fined for being poor.");
        displayBal();
    }
    
}

public class Q1 {
    public static void main(String[] args) {
        int op=0, ch;
        double amt;
        Current c = new Current(5000.0, "Ujjwal", 12);
        Savings s = new Savings(10000.0, "Ujjwal", 15);
        while(op!=3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to the Iron Bank of Braavos!");
            System.out.println("1. Current Account");
            System.out.println("2. Savings Account");
            System.out.println("3. Exit");
            System.out.print("Choose your destiny: ");
            op = sc.nextInt();
            if(op==1) {
                System.out.println("Current account selected");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Display Balance");
                System.out.print("Choose your destiny: ");
                ch = sc.nextInt();
                switch(ch) {
                    case(1): 
                        System.out.print("Enter amount: ");
                        amt = sc.nextDouble();
                        c.withdraw(amt);
                        break;
                    case(2):
                        System.out.print("Enter amount: ");
                        amt = sc.nextDouble();
                        c.deposit(amt);
                        break;
                    case(3):
                        c.displayBal();
                        break;
                    default:
                        System.out.println("Invalid!");
                }
            }
            else if(op==2) {
                System.out.println("Savings account selected");
                System.out.println("Choose your destiny!");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Display Balance");
                System.out.println("4. Compute Interest");
                System.out.print("Choose your destiny: ");
                ch = sc.nextInt();
                switch(ch) {
                    case(1): 
                        System.out.print("Enter amount: ");
                        amt = sc.nextDouble();
                        s.withdraw(amt);
                        break;
                    case(2):
                        System.out.print("Enter amount: ");
                        amt = sc.nextDouble();
                        s.deposit(amt);
                        break;
                    case(3):
                        s.displayBal();
                        break;
                    case(4):
                        s.computeInterest();
                    default:
                        System.out.println("Invalid!");
                }                
            }
        }
    }
}
