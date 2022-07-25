public class StantonMeasure {

    static int stantonMeasure(int[ ] a){
        int count1 = 0;
        int result = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] == 1){
                count1++;
            }
        }

        for(int i=0; i<a.length; i++){
            if(a[i] == count1){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] array = new int[]{};
        int result = stantonMeasure(array);
        System.out.println("Result is "+ result);
    }
}
