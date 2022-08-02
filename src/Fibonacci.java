public class Fibonacci {

    static int closestFibonacci(int n){
        int n1= 1;
        int n2 = 1;
        int n3 = 0;

        while (n > 0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            if(n3 >= n){
                n3 = n1;
                break;
            }
        }

        return n3;
    }

    static int isFibonacci(int n){
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;

        boolean isFibonacci = false;

        while (n3 >= n){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if(n3 == n) {
                isFibonacci = true;
                break;
            }
        }

        if(isFibonacci){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + closestFibonacci(36));
        System.out.println("Is Fibonacci: " + isFibonacci(15));
    }
}
