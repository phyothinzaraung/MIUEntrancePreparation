public class Array235 {

    static int is235Array(int[ ] a){

        if(a.length == 0) return 1;

        int twoCount = 0;
        int threeCount = 0;
        int fiveCount = 0;
        int otherCount = 0;

        for (int j : a) {
            if (j % 2 == 0) {
                twoCount++;
            }
            if (j % 3 == 0) {
                threeCount++;
            }
            if (j % 5 == 0) {
                fiveCount++;
            }
            if (j % 2 != 0 && j % 3 != 0 && j % 5 != 0) {
                otherCount++;
            }
        }

        if(twoCount + threeCount + fiveCount + otherCount == a.length)
            return 1;
        else return 0;

    }

    public static void main(String[] args) {
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11}));
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32}));
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(is235Array(new int[]{7, 11, 77, 49}));
        System.out.println(is235Array(new int[]{2}));
        System.out.println(is235Array(new int[]{}));
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }
}
