/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujj.java.lab.pkg4;

import java.util.Scanner;

class Box {
    double width, height, dept;

    public Box(double width, double height, double dept) {
        this.width = width;
        this.height = height;
        this.dept = dept;
    }
    
    public double Volume() {
        return width*height*dept;
    }
}


public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width, height and dept of box: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double dept = sc.nextDouble();
        Box b = new Box(width, height, dept);
        System.out.println("Volume is: " + b.Volume());
    }
    
}
