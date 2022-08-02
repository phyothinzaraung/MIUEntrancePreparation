public class PairedN {

    static int isPairedN(int[ ] a, int n){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] + a[j] == n){
                    if(a[i] + a[j] == i + j){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("PariedN: " + isPairedN(new int[]{}, 0));
    }
}
