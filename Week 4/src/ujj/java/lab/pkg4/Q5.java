/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujj.java.lab.pkg4;

class Number {
    private final double num;

    public Number() {
        num = 0;
    }
    public Number(double num) {
        this.num = num;
    }
    public boolean isZero() {
        return (num==0);
    }
    public boolean isPositive() {
        return (num>0);
    }
    public boolean isNegative() {
        return (num<0);
    }
    public boolean isOdd() {
        return (num%2!=0);
    }
    public boolean isEven() {
        return (num%2==0);
    }
    public boolean isPrime() {
        for(int i=3; i<num/2; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public boolean isArmstrong() {
        int n = (int)num;
        int sum = 0;
        while(n!=0) {
            sum+= Math.pow((n%10),3);
            n/=10;
        }
        return(sum==(int)num);
    }
}
public class Q5 {
    public static void main(String args[]) {
        Number n = new Number(371);
        System.ou.isZero());
        n.isPositive();
        n.isNegative();
        n.isOdd();
        n.isEven();
    }
}
