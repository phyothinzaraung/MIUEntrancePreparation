public class CubePowerful {

    static int isCubePowerful(int n){

        if(n <=0 ) return 0;

        int temp = n;
        String numStr = String.valueOf(temp);
        int sum = 0;

        for(int i=0; i<numStr.length(); i++){
            int modulus = temp%10;
            sum += modulus * modulus * modulus;
            temp = temp/10;
        }

        if(n == sum){
            return 1;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println("Result: " + isCubePowerful(-81));
    }
}
