package ujjlab9;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> h = new HashMap<>();
        String a = "sirswagalot";
        String b = "nope";
        for(char j:a.toCharArray()) {
            if(h.putIfAbsent(j, 1)!=null) {
                h.put(j, h.get(j)+1);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char j:a.toCharArray())
            sb = (h.get(j)>1)?sb.append(b):sb.append(j);
        System.out.println(sb);
    }
}
