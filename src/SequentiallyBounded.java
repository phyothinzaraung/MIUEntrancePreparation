public class SequentiallyBounded {

    //Not correct yet

    static int isSequentiallyBounded(int[ ] a) {
        if (a.length == 0) return 1;

        int duplicateCount = 1;
        boolean isSequential = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    ++duplicateCount;
                    if (duplicateCount < a[i]) {
                        isSequential = true;
                    }else {
                        isSequential = false;
                    }
                }
            }
        }
        if (isSequential) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isSequentiallyBounded(new int[]{3,3,5,5,5,5}));
    }
}
