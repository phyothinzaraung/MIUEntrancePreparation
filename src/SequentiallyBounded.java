public class SequentiallyBounded {

    //Not correct yet

    static int isSequentiallyBounded(int[ ] a) {
        if (a.length < 2) return 1;

        int start = 0;
        for(int i=0; i<a.length; i++){
            int count = 0;

            if(a[i] <= 0) return 0;

            if(i < a.length-1){
                if(a[i] > a[i+1]) return 0;
            }

            start = a[i];
            for(int j=i; j<a.length; j++){
                if(start == a[j]){
                    count++;
                }
                if(count >= start){
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{1, 2, 3}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5,5,5}));
        System.out.println(isSequentiallyBounded(new int[]{5,5,2,5}));
    }
}
