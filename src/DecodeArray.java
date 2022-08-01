public class DecodeArray {

    static int decodeArray(int[ ] a){

        String result = "";


        for(int i=1; i<a.length; i++){
            int minusResult = a[i-1] - a[i];
            result += Math.abs(minusResult);
        }

        System.out.println(result);

        if(a[0] < 0){
            result = "-" + result;
        }

        return Integer.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + decodeArray(new int[]{1, 1}));
    }
}
