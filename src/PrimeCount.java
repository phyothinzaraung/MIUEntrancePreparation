public class PrimeCount {
    static int primeCount(int start, int end){

        int result = 0;

        if(start < 1){
            start = 2;
        }

        if (end < start){
            return 0;
        }

        for(; start <=end; start++){
            boolean isPrime = true;
            for(int i=2; i < start; i++){
                if(start % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args){

        int primeCount = primeCount(10, 30);
        System.out.println("Prime Count " + primeCount);
    }
}

// Time Complexity O(n) => it needs to loop from start to end that is n size numbers