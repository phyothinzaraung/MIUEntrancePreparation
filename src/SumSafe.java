public class SumSafe {

    static int isSumSafe(int[] a){
        int sum = 0;
        boolean isSumSafe = true;

        for (int k : a) {
            sum += k;
        }

        for (int j : a) {
            if (sum == j) {
                isSumSafe = false;
                break;
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
