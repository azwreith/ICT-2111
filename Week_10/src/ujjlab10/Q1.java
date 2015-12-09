package ujjlab10;

import java.io.*;

public class Q1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String s = "Hello There!";
        File f1 = new File("Q1File1.txt");
        File f2 = new File("Q1File2.txt");
        FileOutputStream out = new FileOutputStream(f1);
        out.write(s.getBytes());
        out.close();
        FileInputStream in = new FileInputStream(f1);
        byte[] b = new byte[in.available()];
        //read
        in.read(b);
        //display
        System.out.println(new String(b));
        //copy
        out = new FileOutputStream(f2);
        out.write(b);
        in.close();
        out.close();
    }
    
}
