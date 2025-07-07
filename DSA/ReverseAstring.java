package DSA;
public class ReverseAstring {
    public static void main(String[] args) {
        String s1="Mada m";
       s1=s1.toLowerCase().replaceAll("\s","");
        boolean result=reverse(s1);
        if(result){ ///if(i==5){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("it is not palindrome");
        }
    }
    private static boolean reverse(String s1){
        int j=0;
        for(int i=s1.length()-1;i>0;i--){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }
}
