public class Solve10 {

    public static void main(String[] args){
    int[] result = solve10();
    for(int number : result){
        System.out.println(number);
    }
}

    static int[] solve10(){

        int target = 6;
        int factorial10 = getFactorial(target);
        int x=0; int y=0;
        int[] resultArr = new int[2];

        for (int i= target-1; i>0; i--){
            x = getFactorial(i);
            y = getFactorial(i);

            if(x + y == factorial10){
                resultArr[0] = x;
                resultArr[1] = y;
                break;
            }else {
                resultArr[0] = 0;
                resultArr[1] = 0;
            }
        }
        return resultArr;
    }

    static int getFactorial(int n){
        int fact = 1;
        for (int i=n; i>0; i--){
            fact = fact * i;
        }
        return fact;
    }

//        static int[] solve10(){
//            int solve10[] = new int[2];
//            int tenFactorial = 1;
//            int x = 0;
//            int y = 0;
//            boolean factorialFound = false;
//            for(int i = 1; i <= 10; i++){
//                tenFactorial = tenFactorial * i;
//            }
//            for(x = 0; x < 10; x++){
//                int xFactorial = 1;
//                if(x > 0){
//                    for(int i = 1; i <= x; i++){
//                        xFactorial = xFactorial * i;
//                    }
//                }
//                for(y = 0; y < 10; y++){
//                    int yFactorial = 1;
//                    if(y > 0){
//                        for(int j = 1; j <= y; j++){
//                            yFactorial = yFactorial * j;
//                        }
//                    }
//                    if(xFactorial + yFactorial == tenFactorial){
//                        factorialFound = true;
//                        break;
//                    }
//                }
//                if(factorialFound){
//                    break;
//                }
//            }
//            if(x == 10 && y == 10){
//                //Not Found
//                x = 0;
//                y = 0;
//            }
//            solve10[0] = x;
//            solve10[1] = y;
//            return solve10;
//        }
}
