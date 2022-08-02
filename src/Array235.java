public class Array235 {

    static int is235Array(int[ ] a){

        if(a.length <= 3) return 0;

        int sum2 = 0;
        int sum3 = 0;
        int sum5 = 0;
        int count = 0;

        for (int j : a) {
            if (j % 2 == 0) {
                sum2 += j / 2;
                count++;
            }
            if (j % 3 == 0) {
                sum3 += j / 3;
                count++;
            }
            if (j % 5 == 0) {
                sum5 += j / 5;
                count++;
            }
        }

        System.out.println(sum2 + "," + sum3 + "," + sum5 + "," + count);

        if(sum2 == 0 || sum3 == 0 || sum5 == 0)return 0;

        if(sum2 + sum3 + sum5 + (a.length - count) != a.length) return 0;



        return 1;

    }

    public static void main(String[] args) {
        System.out.println("235Array: " + is235Array(new int[]{2, 4, 8, 16, 32}));
    }
}
