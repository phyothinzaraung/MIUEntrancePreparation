public class MatchPattern {
    static int matchPattern(int[] a,int[] pattern) {
        int i=0; int k=0;
        int matches = 0;

        for(i=0; i<a.length; i++){
            if(a[i] == pattern[k]){
                matches++;
            } else if (matches==0 || k== pattern.length-1) {
                return 0;
            }else {
                k++;
            }
        }

        if (i==a.length && k==pattern.length-1)
            return 1;
        else return 0;

    }

    public static void main(String[] args) {
        System.out.println("Result: " + matchPattern(new int[]{1,1,1,1,2,2,3,3}, new int[]{1,2,3}));
    }
}
