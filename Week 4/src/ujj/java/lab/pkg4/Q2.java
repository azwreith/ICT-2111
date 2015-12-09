/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujj.java.lab.pkg4;

import java.util.Scanner;

class Employee {
    String name, city;
    int basic;
    float da, hra, sal;

    public void getData(String name, String city, int basic, float da, float hra) {
        this.name = name;
        this.city = city;
        this.basic = basic;
        this.da = da;
        this.hra = hra;
    }
    
    public void calculate() {
        sal = basic + basic*da/100 + basic*hra/100;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Salary: " + sal);
    }
    
}


public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        String name = sc.next();
        String city = sc.next();
        int basic = sc.nextInt();
        float da = sc.nextFloat();
        float hra = sc.nextFloat();
        e.getData(name, city, basic, da, hra);
        e.calculate();
        e.display();
    }
}
