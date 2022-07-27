public class MinMaxDisjoint {

    static int isMinMaxDisjoint(int[ ] a){

        if(a.length < 3) return 0;

        int min = a[0], max = a[0];
        int minCount = 0;
        int maxCount = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
                minCount = 1;
                minIndex = i;
            }
            if(a[i] > max){
                max = a[i];
                maxCount = 1;
                maxIndex = i;
            }

            if(a[i] == min){
                minCount++;
            } else if(a[i] == max){
                maxCount++;
            }
        }

        System.out.println(min + "-" + minCount);
        System.out.println(max + "-" + maxCount);


        if(min == max || minCount > 1 || maxCount>1){
            return 0;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isMinMaxDisjoint(new int[]{1,2,3,4,5}));
    }
}
