package DSA.matrix;

import java.util.Scanner;

public class max_in_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n = sc.nextInt();
        int[][] arr=new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
               if(arr[i][j]>max){
                   max = arr[i][j];
               }
            }
        }
        System.out.println(max);
    }
}
