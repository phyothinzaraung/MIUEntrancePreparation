import java.util.ArrayList;

public class OddHeavy {

    static int isOddHeavy(int[] a){
        ArrayList<Integer> oddArray = new ArrayList<>();
        ArrayList<Integer> evenArray = new ArrayList<>();
        boolean isOddHeavy = true;

        for(int i=0; i<a.length; i++){
            if(a[i]%2 == 0){
                evenArray.add(a[i]);
            }else {
                oddArray.add(a[i]);
            }
        }

        if(oddArray.size() < 1){
            return 0;
        }

        for(int i=0; i<oddArray.size(); i++){
            for(int j=0; j<evenArray.size(); j++){
                if(oddArray.get(i) < evenArray.get(j)){
                    isOddHeavy = false;
                    break;
                }
            }
        }

        if(isOddHeavy){
            return 1;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println("Result: " + isOddHeavy(new int[]{-2,-4,-6,-8,-11}));
    }
}
