package DSA;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String s1="banana";
        s1=s1.replaceAll("\\s","");

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
        }
        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
