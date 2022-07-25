public class ConverToBase10 {

    static int convertToBase10(int[ ] a, int base){

        boolean isLegal = isLegalNumber(a, base);
        int decimalNum = 0;
        int j = a.length-1;

        if(isLegal){
            for(int i=0; i<a.length; i++){
                decimalNum += a[j] * Math.pow(base, i);
                j--;
            }
        }else {
            return 0;
        }

        return decimalNum;

    }

    static boolean isLegalNumber(int[ ] a, int base){
        for(int i=0; i<a.length; i++){
            if(a[i] > base){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[ ] {3, 7, 1}, 6));
    }
}
