package DSA;

public class rotate_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=arr[0];
        int j=0;
        int[] temp=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            temp[j]=arr[i];
            j++;
        }
        temp[j]=x;

        for(int a:temp){
            System.out.print(a+" ");
        }

    }
}
