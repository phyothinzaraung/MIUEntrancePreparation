import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inertial {

    static int isIntertial(int[] a){
        int max = a[0];
        ArrayList<Integer> oddArr = new ArrayList<Integer>();

        if(a.length < 2) return 0;

        for(int i=0; i<a.length; i++){
            if(a[i] > max) max = a[i]; //max value
            if(a[i] % 2 != 0){
                oddArr.add(a[i]);// odd Array
            }
        }

        if(max % 2 !=0 || oddArr.size() < 1) return 0; //max is odd || didn't meet at least 1 odd value

        for(int i=0; i< oddArr.size(); i++){
            for (int j=0; j<a.length; j++){
                if(a[j] % 2 == 0 && a[j] != max && a[j] > oddArr.get(i)) return 0;// even && not max && even > odd
            }
        }

        return 1;
    }

    public static void main(String[] args){
        int[] array = new int[]{2, 12, 12, 4, 6, 8, 11};
        int result = isIntertial(array);
        System.out.println("Intertial is " + result);
    }
}
