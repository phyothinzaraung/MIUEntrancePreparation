public class Divisible {

    static int isDivisible(int [ ] a, int divisor){

        boolean isDivisible = false;

        if(a.length == 0){
            return 1;
        }

        for(int i=0; i<a.length; i++ ){
            if(a[i] % divisor == 0){
                isDivisible = true;
            }else {
                isDivisible = false;
                break;
            }
        }

        if(isDivisible){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{};
        int result = isDivisible(array, 12);
        System.out.println("Result is " + result);
    }
}
