/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujj.java.lab.pkg4;

class Complex {
    int i,r;

    public Complex(int i, int r) {
      this.i=i;
      this.r=r;
    }

    public void display() {
      System.out.println(r + "+" + i + "i");
    }

    public static Complex sum(int r, Complex a) {
      Complex c = new Complex();
      c.r = r + a.r;
      c.i = a.i;
      return c;
    }
    public static Complex sum(Complex a, Complex b) {
      Complex c = new Complex();
      c.r = a.r + b.r;
      c.i = a.i + b.i;
      return c;
    }
}
public class Q4 {
  public static void main(String[] args) {
    Complex a = new Complex(10, 20);
    Complex b = new Complex(12, 30);
    Complex c = Complex.add(10, a);
    Complex d = Complex.add(a,b);
    c.display();
    d.display();
  }
}
