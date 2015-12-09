package ujjlab5;

import java.util.*;
class Base
{
    int reg_no,age;
    String name;
    Base(int r,int a,String s)
    {
        reg_no=r;
        age=a;
        name=s;
    }
    void display()
    {
        System.out.println(reg_no +" "+name+" "+age);
    }

}
class UG extends Base
{
    int semester,fees;
    UG(int r,int a,String s,int sem,int f)
    {
        super(r,a,s);
        semester=sem;
        fees=f;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println(semester+" "+fees);
    }
}
class PG extends Base
{
    int semester,fees;
    PG(int r,int a,String s,int sem,int f)
    {
     
        super(r,a,s);
        semester=sem;
        fees=f;
    }
    @Override
    void display()
    {
      super.display();
      System.out.println(semester+" "+fees);
        
    }
}
public class Q2
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int reg,age,sem,fee;
      String name;
      System.out.println("Enter UG details!");
      reg=sc.nextInt();
      name=sc.next();
      age=sc.nextInt();
      sem=sc.nextInt();
      fee=sc.nextInt();
      UG a=new UG(reg,age,name,sem,fee);
      System.out.println("Enter PG details!");
      reg=sc.nextInt();
      name=sc.next();
      age=sc.nextInt();
      sem=sc.nextInt();
      fee=sc.nextInt(); 
      PG b=new PG(reg,age,name,sem,fee);
      System.out.println("UG details!");
      a.display();
      System.out.println("PG details!");
      b.display();
    }
    
}
