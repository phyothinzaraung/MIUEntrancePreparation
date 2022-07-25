public class StackedNumber {

    static int isStacked(int n){

        if(n == 1){
            return 1;
        }

        int sum = 0;
        for(int i=1; i<n; i++){
            sum +=i;
            if(sum == n){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Result is " + isStacked(14));
    }
}
