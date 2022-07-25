public class LegalNumber {

    static int isLegalNumber(int[ ] a, int base){

        boolean isLegal = true;

        for(int i=0; i<a.length; i++){
            if(a[i] > base){
                isLegal = false;
                break;
            }
        }

        if(isLegal){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,7,1};
        int result = isLegalNumber(array, 6);
        System.out.println("Result is " + result);
    }
}
