package DSA;

public class string_example {
    public static void main(String[] args) {
        String[] arr={"abc","aaaab","bbccb","bbvcxd","acb"};
        String[] arr1=new String[arr.length];
        int index=0;
        int maxLen = 0;
        int secondMaxLen = 0;
        // Step 1: Find max and second max length
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLen) {
                secondMaxLen = maxLen;
                maxLen = arr[i].length();
            } else if (arr[i].length() > secondMaxLen && arr[i].length() < maxLen) {
                secondMaxLen = arr[i].length();
            }
        }
        for(int i=0;i< arr.length-1;i++){
            if(arr[i].length()==secondMaxLen){
                arr1[index++]=arr[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(arr1[i]);
        }
    }
}
