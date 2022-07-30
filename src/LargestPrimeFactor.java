import java.util.ArrayList;

public class LargestPrimeFactor {

    static int largestPrimeFactor(int n){
        if (n == 0 || n == 1) return 0;

        ArrayList<Integer> primeList = new ArrayList<>();
        int largestPrimeFactor = 0;

       for(int i=2; i<n; i++){
           if(isPrimeNumber(i)){
               primeList.add(i);
           }
       }

       for(int i=0; i<primeList.size(); i++){
           if(n%primeList.get(i) == 0){
               largestPrimeFactor = primeList.get(i);
           }
       }

        System.out.println(primeList);

        return largestPrimeFactor;
    }

    static boolean isPrimeNumber(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + largestPrimeFactor(10));
    }
}
