import java.util.HashSet;
import java.util.Set;

public class SequencedArray {

    static int isSequencedArray(int[ ] a, int m, int n){
        if(a[0] != m) return 0;
        if(a[a.length-1] != n) return 0;

        int gap = a[1] - a[0];

        if(gap != 0){
            for(int i=2; i<a.length; i++){
                if(a[i] - a[i-1] != gap) {
                    return 0;
                }
            }
        }else {
           for(int i=1; i<a.length; i++){
               if(a[i] - a[i-1] != 0){
                   int duplicateGap = a[i] - a[i-1];
                   if(duplicateGap != a[i] - a[i-1]){
                       return 0;
                   }
               }else {
                   continue;
               }
           }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isSequencedArray(new int[]{1,2,3,4,5}, 1, 5));
    }
}
