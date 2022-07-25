public class SumSafe {

    static int isSumSafe(int[] a){
        int sum = 0;
        boolean isSumSafe = true;

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        for(int i=0; i<a.length; i++){
            if(sum == a[i]){
                isSumSafe = false;
            }
        }

        if(isSumSafe){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result is " + isSumSafe(new int[]{5, -5, 0}));
    }
}
