public class Vanilla {

    static int isVanilla(int[ ] a){
        if(a.length == 0) return 1;

        int digit = a[0] % 10;

        for(int i=0; i<a.length; i++){
            if(a[i]<0){
                a[i] = -1 * a[i];
            }

            if(a[i]%10 != digit) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
    }
}
