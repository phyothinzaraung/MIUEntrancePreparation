import java.util.ArrayList;

public class EncodeArray {

    static int[] encodeArray(int n){
        int sign = 1;
        if(n<0) {
            sign = -1;
            n = -n;
        }
        ArrayList<Integer> numArr = new ArrayList<>();
        while (n!=0){
            int remainder = n%10;
            n = n/10;
            numArr.add(remainder);
        }

        ArrayList<Integer> resultArr = new ArrayList<>();
        if(sign == -1){
            resultArr.add(-1);
        }

        System.out.println(numArr);

        for(int i=0; i<numArr.size(); i++){
            for(int j=0; j<numArr.get(i); j++){
               resultArr.add(0);
            }
            resultArr.add(1);
        }


        int[] result = new int[resultArr.size()];
        for(int i=0; i<resultArr.size(); i++){
            result[i] = resultArr.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(encodeArray(1001));
//        System.out.println(encodeArray(999));
//        System.out.println(encodeArray(-1));
//        System.out.println(1);
    }
}
