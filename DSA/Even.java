package DSA;

public class Even {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,0,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
