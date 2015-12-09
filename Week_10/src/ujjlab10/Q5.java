package ujjlab10;

import java.io.*;

class Student implements Serializable {
    String name;
    float marks[];
    int rno;
    float avg;
    char grade;
    
    Student(String name, int rno, float marks[]) {
        this.name=name;
        this.rno=rno;
        this.marks=marks;
    }

    public void calculateGrade() {
        float sum=0;
        for(int i=0;i<3;i++) {
            sum+=this.marks[i];
        }
        avg=(sum/3);
        if(avg>90)
            grade='A';
        else if(avg>80)
            grade='B';
        else if(avg>70)
            grade='C';
        else
            grade='D';
    }

    @Override
    public String toString() {
        return ("Name: " + name + " \nRoll: " + rno + " \nPercentage: " + avg + " \nGrade: " + grade);
    }

}
public class Q5 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Student s = new Student("Ujj", 42, new float[]{90,91,92});
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Q5File"));
        out.writeObject(s);
        out.flush();
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Q5File"));
        s = (Student) in.readObject();
        s.calculateGrade();
        System.out.println(s);
        in.close();
        out = new ObjectOutputStream(new FileOutputStream("Q5File"));
        out.writeObject(s);
        out.flush();
        out.close();
    }
}