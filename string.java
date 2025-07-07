//Print characters in a string one by one
public class string {
    public static void main(String[] args) {
        String s1="Hello World";

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            System.out.println(ch);
        }
    }
}
