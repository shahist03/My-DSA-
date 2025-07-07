package DSA;



public class count_words {
    public static void main(String[] args) {
        String s1="I am Learning DSA";

        String[] words=s1.split("\\s");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(words.length);
    }
}
