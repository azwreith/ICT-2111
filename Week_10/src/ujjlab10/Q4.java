package ujjlab10;

import java.io.*;

public class Q4 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String s = "Hello There!";
        FileWriter out = new FileWriter("Q4File.txt");
        FileReader in = new FileReader("Q4File.txt");
        char buff[] = s.toCharArray();
        for(int i = 0; i<buff.length; i++)
            out.write(buff[i] + 13);
        out.close();
        int c;
        while((c = in.read()) != -1)
            System.out.print((char)(c - 13));
        in.close();
    }
    
}