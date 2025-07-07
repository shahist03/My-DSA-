//Find whether a number is prime or not
public class isprime {
    public static void main(String[] args) {
        int n=7;
        boolean result= isPrime(n);

        if (result) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }



    }
    private static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
