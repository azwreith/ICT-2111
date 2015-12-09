package ujjlab10;

import java.io.*;

public class Q3 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String s = "Hello!. I am Ujjwal.";
        FileWriter out = new FileWriter("Q3File.txt");
        FileReader in = new FileReader("Q3File.txt");
        out.write(s);
        out.close();
        int c, chars = 0, vowels = 0, lines = 0, words = 1;
        while((c = in.read()) != -1) {
            chars++;
            if("aeiouAEIOU".indexOf(c) != -1)
                vowels++;
            if(c == '.')
                lines++;
            if(c == ' ')
                words++;
        }
        in.close();
        System.out.println(chars + " " + vowels + " " + lines + " " + words);
    }
    
}
