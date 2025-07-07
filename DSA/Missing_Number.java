package DSA;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        int n=arr.length;
        int sum=0;
        int expectedSum = (n + 1) * (n + 2) / 2;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        sum=expectedSum-sum;
        System.out.println(sum);

    }
}
