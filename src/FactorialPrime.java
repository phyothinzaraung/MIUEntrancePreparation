public class FactorialPrime {

    static int isFactorialPrime(int n){
        if(isPrime(n)){
            if(n == getFactorial(n-1) + 1 ){
                return 1;
            }
        }
        return 0;
    }

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    static int getFactorial(int n){
        int factorial = 1;

        for(int i=n; i>0; i--){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isFactorialPrime(721));
    }
}
