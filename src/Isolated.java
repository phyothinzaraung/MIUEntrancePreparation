
public class Isolated {

    static int isIsolated(long n){

        if(n<1 || n>2097151){
            return -1;
        }

        long square = n * n;
        long cube = n*n*n;

        String squareStr = String.valueOf(square);
        while (cube !=0){
            if(squareStr.contains(String.valueOf(cube %10))){
                return 0;
            }
            cube = cube / 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Result is " + isIsolated(162));
    }
}
