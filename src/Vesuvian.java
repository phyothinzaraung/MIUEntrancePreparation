public class Vesuvian {

    static  int isVesuvian(int n){

        int count = 0;

        for(int i=1; (i*i)<n; i++){
            int sum1 = i*i;
            for(int j=1; (j*j)<n; j++){
                int sum2 = j*j;

                if((sum1 + sum2) == n){
                    count++;
                }
            }
        }

        if(count >= 2){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isVesuvian(55));
    }
}
