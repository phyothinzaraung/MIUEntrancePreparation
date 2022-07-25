public class SumFactor {
    static int sumFactor(int[ ] a){
        int sum = 0;
        int result = 0;

        for(int i=0; i< a.length; i++){
            sum += a[i];
        }

        for(int i=0; i<a.length; i++){
            if(sum == a[i]){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] array = new int[]{0,0,0};
        int result = sumFactor(array);
        System.out.println("Result is " + result);

    }
}
