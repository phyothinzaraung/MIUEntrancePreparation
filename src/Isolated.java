import java.lang.reflect.Array;
import java.util.ArrayList;

public class Isolated {

    static int isIsolated(long n){

        if(n<1 || n>2097151){
            return -1;
        }

        long square = n*n;
        long cube = n*n*n;
        boolean isIsolated = true;

        ArrayList<Integer> squareArr = new ArrayList<>();
        ArrayList<Integer> cubeArr = new ArrayList<>();

        for(int i=0; i< String.valueOf(square).length(); i++){
            int modulus = (int) (square % 10);
            if(modulus == squareArr.get(i)){
                squareArr.add(modulus);
            }
        }

        for(int i=0; i< String.valueOf(cube).length(); i++){
            int modulus = (int) (cube%10);
            if(modulus == cubeArr.get(i)){
                cubeArr.add(modulus);
            }
        }

        System.out.println(squareArr);
        System.out.println(cubeArr);

        for(int i=0; i<squareArr.size(); i++){
            for(int j=0; j<cubeArr.size(); j++){
                if(squareArr.get(i) == cubeArr.get(j)){
                    isIsolated = false;
                    break;
                }
            }
        }

        if(isIsolated){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result is " + isIsolated(163));
    }
}
