package DSA;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr={4,3,1,6,9,4};
        Maximum(arr);

    }
    private static void Maximum(int[] arr){
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
