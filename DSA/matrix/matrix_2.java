package DSA.matrix;

import java.util.Scanner;

public class matrix_2 {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int[][] result=new int[5][5];
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                result[j][i] = A[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
