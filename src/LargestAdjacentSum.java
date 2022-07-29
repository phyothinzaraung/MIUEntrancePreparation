public class LargestAdjacentSum {

    static int largestAdjacentSum(int[ ] a){
        int largestSum = a[0] + a[1];
        for(int i=2; i<a.length; i++){
            if(largestSum < a[i-1] + a[i]){
                largestSum = a[i-1] + a[i];
            }
        }
        return largestSum;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + largestAdjacentSum(new int[]{1,1}));
    }
}
