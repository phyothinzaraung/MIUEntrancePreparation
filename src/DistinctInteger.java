import java.util.ArrayList;
import java.util.Arrays;

public class DistinctInteger {

    //https://compro.miu.edu/sample-test/
    //5

    static int[] f(int[] first, int[] second){

        if(first == null || second == null){
            return null;
        }

        ArrayList<Integer> distinctArr = new ArrayList<>();

        for(int i=0; i<first.length; i++){
            for(int j=0; j<second.length; j++){
                if(first[i] == second[j]){
                    //distinctArr[distinctIndex++] = second[j];
                    distinctArr.add(first[i]);
                }
            }
        }

        int[] resultArray = new int[distinctArr.size()];
        for(int i=0; i<distinctArr.size(); i++){
            resultArray[i] = distinctArr.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] result = f(new int[]{}, null);
        System.out.println(Arrays.toString(result));
    }
}
