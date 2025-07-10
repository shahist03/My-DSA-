package DSA.matrix;

import java.util.Scanner;

public class Row_max {
    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        Scanner sc=new Scanner(System.in);
        int max=0;
        for(int i=0;i<3;i++){
            for( int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i;
        for( i=0;i<3;i++){
            int sum=0;
            for( int j=0;j<3;j++){
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(i+" th row have max value "+max);
    }
}
