import javax.print.attribute.standard.PresentationDirection;

public class ReverseOrder {

    //https://compro.miu.edu/sample-test/
    //No. 4

    static int f(int n){

        int sign = 1;

        if(n ==0) return 0;
        if(n < 0) {
            n = -n;
            sign = -1;
        }

        int reverse = 0;

        while (n != 0){
            reverse = (reverse * 10) + (n%10);
            n = n/10;
        }
        return reverse * sign;
    }

    public static void main(String[] args) {
        System.out.println(f(0));
    }
}
