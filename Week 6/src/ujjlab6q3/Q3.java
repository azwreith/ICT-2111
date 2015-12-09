package ujjlab6q3;

interface Shape {
    abstract double area();
}

class Rectangle implements Shape {
    double l,b;
    Rectangle(double l, double b) {
        this.l=l;
        this.b=b;
    }
    

    @Override
    public double area() {
        return l*b;
    }
}

class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r=r;
    }
    
    @Override
    public double area() {
        return Math.PI*r*r;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.5,20.34);
        Circle c = new Circle(12.46);
        System.out.println(r.area());
        System.out.println(c.area());
    }
}
