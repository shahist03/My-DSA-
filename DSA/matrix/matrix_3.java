package DSA.matrix;

import java.util.Scanner;

public class matrix_3 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                sum+=A[i][j];
            }
        }
        System.out.println(sum);

    }
}
