package ujjlab10;

import java.io.*;

class Employee implements Serializable {
    String name;
    int id;
    float sal, ded, netSal, allowance;
    
    Employee(String name, int id, float sal) {
        this.name=name;
        this.id=id;
        this.sal=sal;
    }

    public void calculate() {
        ded = sal/10;
        allowance = sal/15;
        netSal = sal - ded + allowance;
    }

    @Override
    public String toString() {
        return ("Name: " + name + " \nID: " + id + " \nNet Sal: " + netSal);
    }

}
public class Q6 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Employee em = new Employee("Ujj", 1, 1000);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Q6File"));
        out.writeObject(em);
        out.flush();
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Q6File"));
        em = (Employee) in.readObject();
        em.calculate();
        System.out.println(em);
        in.close();
        out = new ObjectOutputStream(new FileOutputStream("Q6File"));
        out.writeObject(em);
        out.flush();
        out.close();
    }
}