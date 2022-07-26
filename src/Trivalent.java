import java.util.HashSet;
import java.util.Set;

public class Trivalent {

    static int isTrivalent (int[ ] a){
        if(a.length < 3){
            return 0;
        }

        Set<Integer> trivalentSet = new HashSet<Integer>();
        for (int i=0; i<a.length; i++){
            trivalentSet.add(a[i]);
        }

        if(trivalentSet.size() == 3){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isTrivalent(new int[]{}));
    }
}
