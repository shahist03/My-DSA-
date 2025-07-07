/*Count number of vowels in a string*/
public class vowels {
    public static void main(String[] args) {
        String s1="HEllo World";
       // s1=s1.toLowerCase().replaceAll("\\s","");
        char ch;
        int count=0;
        for(int i=0;i<s1.length();i++){
            ch=s1.charAt(i);
            if(ch=='a' || ch== 'e' || ch=='i' || ch =='o' || ch=='u'){
                count++;
            }

        }
        System.out.println("vowels are "+count);
    }
}
