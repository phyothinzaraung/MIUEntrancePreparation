public class RepsEqual {

    static int repsEqual(int[] a, int n){

        int i,j =0;
        int sum = 0;

        for(i = a.length - 1, j = 0; i >= 0; i--) {
            sum += Math.pow(10, j++) * a[i];
        }

        if(n == sum){
            return 1;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int result = repsEqual(new int[] {3, 2, 0, 5, 3}, 32053);
        System.out.println("Result is " + result);
    }
}
