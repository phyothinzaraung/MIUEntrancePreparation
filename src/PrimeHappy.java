import java.util.ArrayList;

public class PrimeHappy {

    static int isPrimeHappy(int n){

        if(n <= 2) return 0;

        ArrayList<Integer> primeList = new ArrayList<>();

        for(int i=2; i<n; i++){
            if(isPrime(i)){
                primeList.add(i);
            }
        }

        int sum = 0;
        for(int i=0; i<primeList.size();i++){
            sum += primeList.get(i);
        }

        if(sum % n == 0){
            return 1;
        }else {
            return 0;
        }
    }

    static boolean isPrime(int n){

        for(int i=2; i<n; i++){
            if(n%i == 0){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime Happy: " + isPrimeHappy(2));
    }
}
