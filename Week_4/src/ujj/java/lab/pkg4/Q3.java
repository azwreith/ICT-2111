/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujj.java.lab.pkg4;

import java.util.Scanner;

class Time {
    int h, m, s;
    
    public Time() {
        h = 0;
        m = 0;
        s = 0;
    }
    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    public void display() {
        System.out.println(h + ":" + m + ":" + s);
    }
    public static Time add(Time a, Time b) {
        Time c = new Time();
        int total = (a.h+b.h)*3600 + (a.m+b.m)*60 + (a.s+b.s);
        c.h = total/3600;
        total = total - c.h*3600;
        c.m = total/60;
        c.s = total - c.m*60;
        return c;
    }
}
public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A and B in HH MM SS Format!");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        Time a = new Time(h1, m1, s1);
        Time b = new Time(h2, m2, s2);
        Time c = Time.add(a, b);    
        c.display();
    }
}
