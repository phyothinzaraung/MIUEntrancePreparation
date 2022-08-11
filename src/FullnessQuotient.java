public class FullnessQuotient {

    static int fullnessQuotient(int n){
        if(n < 1) return -1;

        int count = 0;
        for(int i=2; i<=9; i++){
            String numStr = Integer.toString(n, i);
            if(!numStr.contains("0")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
        System.out.println(fullnessQuotient(94));
    }
}
