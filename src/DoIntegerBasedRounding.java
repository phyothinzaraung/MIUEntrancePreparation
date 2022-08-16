public class DoIntegerBasedRounding {

    static void doIntegerBasedRounding(int[ ] a, int n){
        if(n>0){
            for(int i=0; i<a.length; i++){
                if(a[i] > 0){
                    int base = n * (a[i] / n);
                    a[i] = Math.abs(a[i] - base) < Math.abs(a[i] - base - n)? base : base+n;
                    System.out.println(a[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        doIntegerBasedRounding(new int[]{1,2,3,4,5}, 3);
    }
}
