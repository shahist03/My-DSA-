package DSA.matrix;

import java.util.Scanner;

public class diagonal_sum{
    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for(int j=0;j<5;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        int n=5;
        for (int i = 0; i <n ; i++) {
            for(int j=0;j<n;j++) {
                if (i ==j || i + j == n - 1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
