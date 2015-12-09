package ujjlab9;
public class Q1 {
    public static void main(String[] args) {
    	String s = "Hi. I am Ujj.";
    	s = s.toLowerCase();
    	int chars = 0, words = s.isEmpty()?0:1, lines = 0, vowels = 0;
    	for(int i=0; i<s.length(); i++) {
    		char a = s.charAt(i);
    		if(Character.isAlphabetic(a))
    			chars++;
    		if(Character.isSpaceChar(a))
    			words++;
    		if(a == '.')
    			lines++;
    		if("aeiou".indexOf(a)!=-1)
    			vowels++;
    	}
    	System.out.println(chars);
    	System.out.println(words);
    	System.out.println(lines);
    	System.out.println(vowels);
    }
}
