public class NUnique {

    static int isNUnique(int[ ] a, int n){

        int sumCount = 0;

        if(a.length < 2){
            return 0;
        }

        for(int i=0; i<a.length; i++){
            for(int j= i+1; j<a.length; j++){
                int sum = a[i] + a[j];
                if(sum == n){
                    sumCount++;
                }
            }
        }

        if(sumCount == 1){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{7};
        int result = isNUnique(array, 4);
        System.out.println("Result is " + result);
    }
}
