public class MinMaxDisjoint {

    static int isMinMaxDisjoint(int[] a){

        if(a.length < 3) return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex=0;
        int maxIndex=0;
        int minCount=1;
        int maxCount=1;

        for(int i=0; i<a.length; i++){

            if(a[i] == min){
                minCount++;
            } else if (a[i] == max) {
                maxCount++;
            }

            if(a[i] < min){
                min = a[i];
                minIndex = i;
                minCount = 1;
            }

            if(a[i] > max){
                max = a[i];
                maxIndex = i;
                maxCount = 1;
            }
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println("MINCount"+ minCount);
        System.out.println("MaxCount"+ maxCount);
        System.out.println("MinIndex" +minIndex);
        System.out.println("MaxIndex" + maxIndex);

        if (minCount == 1 && maxCount == 1 && ((minIndex - maxIndex) < -1 || (minIndex - maxIndex) > 1)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isMinMaxDisjoint(new int[]{1,2,3,4,5}));
    }
}
