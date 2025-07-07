package DSA;

public class Fibonacci {

    public static void main(String[] args) {
      /*  int n=8;
        int num1=0;
        int num2=1;
        System.out.print(num1+" "+num2);
        for(int i=2;i<n;i++){
            int temp=num1+num2;
            System.out.print(" "+temp);
            num1=num2;
            num2=temp;
        }*/

        int n=3;
        int a=1;
        int i=2;
        int count=0;
        while(count<n){
            if(isPrime(i)){
                a=a*i;
                count++;
            }
            i++;
        }
        System.out.println(a);
    }
    private static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
