public class HodderNumber {

    static int isHodder(int n){
        if(isPrime(n)){
            for(int i=0; i<n/2; i++){
                if(Math.pow(2, i) - 1 == n){
                    return 1;
                }
            }
        }
        return 0;
    }

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isHodder(113));
    }
}
