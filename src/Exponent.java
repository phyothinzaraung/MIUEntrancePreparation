public class Exponent {

    static int getExponent(int n, int p){
        if(p <= 1) return -1;

        int exponentCount = 0;
        while (n!=0){
            if(n%p==0){
                n = n/p;
                System.out.println(n);
                exponentCount++;
            }else {
                break;
            }

        }
        return exponentCount;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + getExponent(128, 4));
    }
}
