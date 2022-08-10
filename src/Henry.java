public class Henry {

    static int henry (int i, int j){
        if(i==0 || j==0) return 0;
        int[] perfectNumbers = getPerfectNumbers(i>j? i:j);
        return perfectNumbers[i-1] + perfectNumbers[j-1];
    }

    static int[] getPerfectNumbers(int n){
        int[] perfectNumbers = new int[n];
        for(int i=0; i<n; i++){
           int perfectNumber = perfectNumbers[i==0? 0: i-1];
           int start = perfectNumber+1;
           while (getSumOfFactor(start) != start){
               start++;
           }
           perfectNumbers[i] = start;
        }
        return perfectNumbers;
    }

    static int getSumOfFactor(int n){
        int sum =0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(henry(1, 2));
    }
}
