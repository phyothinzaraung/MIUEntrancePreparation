public class Square {

    static int isSquare(int n){
        int value = 0;
        if(n < 0){
            return 0;
        }

        while (value * value <= n){
            if(value*value == n){
                return 1;
            }
            value++;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result is " + isSquare(25));
    }
}
