public class DigitIncreasing {

    static int isDigitIncreasing(int n){
        if(n<10) return 1;

        for(int i=1; i<9; i++){
            if(n%i==0){
                StringBuilder stringBuilder = new StringBuilder();
                int sum = 0;
                for(int j=1; j<9; j++){
                    stringBuilder.append(i);
                    sum += Integer.parseInt(String.valueOf(stringBuilder));

                    if(sum == n){
                        return 1;
                    }else if(sum > n){
                        sum = 0;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(24));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }
}
