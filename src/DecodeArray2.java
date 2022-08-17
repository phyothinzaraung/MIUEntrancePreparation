import java.lang.reflect.Array;
import java.util.ArrayList;

public class DecodeArray2 {

    static int decodeArray(int[ ] a){
        int sign = 1;
        int start = 0;
        if(a[0] == -1){
            sign = -1;
            start = 1;
        }

        int zeroCount = 0;
        ArrayList<Integer> tempArr = new ArrayList<>();

        for(int i= start; i<a.length; i++){
            if(a[i]==1){
                tempArr.add(zeroCount);
                zeroCount=0;
            }else {
                zeroCount++;
            }
        }

        int result = 0;
        int pow = 0;

        for(int i=tempArr.size()-1; i>=0; i--){
            result += tempArr.get(i) * Math.pow(10, pow++);
        }

        return sign * result;
    }

    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{1}));
        System.out.println(decodeArray(new int[]{0,1}));
        System.out.println(decodeArray(new int[]{-1,0,1}));
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
    }
}
