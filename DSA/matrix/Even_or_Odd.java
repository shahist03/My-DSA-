package DSA.matrix;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int even=0,odd=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println(even+" are even");
        System.out.println(odd+ " are odd");
    }
}
