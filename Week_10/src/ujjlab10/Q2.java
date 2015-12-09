package ujjlab10;

import java.io.*;

public class Q2 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile f = new RandomAccessFile("Q2File.txt", "rw");
        f.writeDouble(3.14);
        f.writeInt(50);
        f.writeBoolean(true);
        f.close();
        //append
        f = new RandomAccessFile("Q2File.txt", "rw");
        f.seek(f.length());
        f.writeChars("Ujj");
        //read
        f.seek(0);
        System.out.println(f.readDouble());
        System.out.println(f.readInt());
        System.out.println(f.readBoolean());
        System.out.println(f.readLine());
        f.close();
    }
    
}
