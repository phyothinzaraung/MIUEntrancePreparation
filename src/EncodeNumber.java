import java.util.ArrayList;

public class EncodeNumber {

    static int[ ] encodeNumber(int n){
        if(n==0 || n== 1) return null;

        ArrayList<Integer> primeList = new ArrayList<>();
        ArrayList<Integer> encodeNumberList = new ArrayList<>();

        for(int i=2; i<n; i++){
            if(isPrime(i)){
                primeList.add(i);
            }
        }

        for (int i=0; i<primeList.size(); i++){
            if(n%primeList.get(i) == 0){
                encodeNumberList.add(primeList.get(i));
            }
        }

        System.out.println(encodeNumberList);

        return convertIntegers(encodeNumberList);
    }

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    static int[] convertIntegers(ArrayList<Integer> input){
        int[] result = new int[input.size()];

        for(int i=0; i<input.size(); i++){
            result[i] = input.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + encodeNumber(6936));
    }
}
